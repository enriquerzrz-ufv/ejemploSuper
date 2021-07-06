package ufv.dis.ejemplo.front;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;
import ufv.dis.ejemplo.back.Equipo;
import ufv.dis.ejemplo.back.Funciones;
import ufv.dis.ejemplo.back.Miembro;
import ufv.dis.ejemplo.back.PWException;

import java.util.ArrayList;


@Theme("mytheme")
public class MyUI extends UI {

    Equipo equipo = new Equipo();
    Miembro miembro = new Miembro();

    final TabSheet tabSheet = new TabSheet();
    final HorizontalLayout crear = new HorizontalLayout();
    final VerticalLayout eliminar = new VerticalLayout();

    //===============AÑADIR==================//
    final TextField name = new TextField("Nombre super: ");
    final TextField age = new TextField("Edad super: ");
    final TextField secretIdentity = new TextField("Identidad Secreta: ");
    final TextArea powers = new TextArea("Poderes: ");

    FormLayout form;
    Grid<Miembro> listaa = new Grid<>(Miembro.class);

    //===============ELIMINAR==================//
    ArrayList<Miembro> listaMiembros = new ArrayList<>();
    ComboBox<Miembro> select = new ComboBox<>("Selecciona Miembro a eliminar");

    Grid<Miembro> listae = new Grid<>(Miembro.class);


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        crear.setCaption("Añadir Super");
        eliminar.setCaption("Eliminar Super");

        equipo = Funciones.leerJson("super.json");

        //===============AÑADIR==================//
        Button button = new Button("Guardar Localidad");
        button.addClickListener(e -> {
            if (name.getValue().equals("") || age.getValue().equals("") || secretIdentity.getValue().equals("") || powers.getValue().equals(""))
                Notification.show("ERROR: No dejes en blanco ningun campo", Notification.Type.WARNING_MESSAGE);
            else{
                try {
                    String[] poderes = powers.getValue().split(",");

                    miembro = new Miembro(name.getValue(), Integer.parseInt(age.getValue()), secretIdentity.getValue(), poderes);

                    Notification.show("Localidad añadida correctamente", Notification.Type.TRAY_NOTIFICATION);
                    equipo.crearMiembro(equipo, miembro);

                } catch (PWException error) {
                    Notification.show("ERROR: Datos mal introducidos", Notification.Type.WARNING_MESSAGE);
                }
                listaa.setItems(equipo.getMembers());
            }
        });

        listaa.setItems(equipo.getMembers());
        form = new FormLayout(name, age, secretIdentity, powers);
        crear.addComponents(form, listaa);
        crear.setMargin(true);

        //===============COMBO BOX==================//
        listaMiembros = equipo.getMembers();
        select.setItems(listaMiembros);

        select.setTextInputAllowed(false);
        select.setEmptySelectionAllowed(false);
        select.setEmptySelectionCaption("Selecciona un valor");

        select.setItemCaptionGenerator(Miembro::getName);

        select.addValueChangeListener(event->{
            equipo.eliminarMiembro(equipo, select.getValue());
            listae.setItems(equipo.getMembers());
        });

        listae.setItems(equipo.getMembers());

        eliminar.addComponents(select, listae);


        tabSheet.addComponents(crear, eliminar);
        setContent(tabSheet);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
