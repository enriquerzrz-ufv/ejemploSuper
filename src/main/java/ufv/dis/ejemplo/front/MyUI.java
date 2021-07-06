package ufv.dis.ejemplo.front;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;
import ufv.dis.ejemplo.back.Equipo;
import ufv.dis.ejemplo.back.Miembro;


@Theme("mytheme")
public class MyUI extends UI {

    Equipo equipo = new Equipo();
    Miembro miembro = new Miembro();

    final TabSheet tabSheet = new TabSheet();
    final HorizontalLayout crear = new HorizontalLayout();
    final VerticalLayout eliminar = new VerticalLayout();

    //===============AÑADIR==================//
    final TextField capital = new TextField("Capital: ");
    final TextField pais = new TextField("pais: ");
    final TextField continente = new TextField("Continente: ");

    FormLayout form;
    Grid<Localidad> listaa = new Grid<>(Localidad.class);

    
    @Override
    protected void init(VaadinRequest vaadinRequest) {

        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
