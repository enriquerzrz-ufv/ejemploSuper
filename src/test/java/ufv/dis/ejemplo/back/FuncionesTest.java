package ufv.dis.ejemplo.back;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.WeakHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FuncionesTest {
    Equipo equipo;
    Miembro miembro;
    String[] powers = {"kk", "kk"};
    ArrayList<Miembro> members = new ArrayList<>();

    @After
    public void after(){
        equipo = new Equipo("kk", "kk", 10, "kk", true, members);
        miembro = new Miembro("kk", 13,"kk", powers);
    }

    @Before
    public void before(){}

    @Test
    public void leerJson() {
        equipo = Funciones.leerJson("super.json");
        assertNotEquals("", equipo.getHomeTown());
    }

    @Test
    public void anadirMiembro(){
        equipo = new Equipo("kk", "kk", 10, "kk", true, members);
        miembro = new Miembro("kk", 13,"kk", powers);

        equipo.crearMiembro(equipo, miembro);
        assertEquals("kk", equipo.getMembers().get(0).getName());
    }

    @Test (expected = PWException.class)
    public void anadirMiembro2() throws PWException{
        equipo = new Equipo("k", "kk", 10, "kk", true, members);
        miembro = new Miembro("", 0,"", powers);

        equipo.crearMiembro(equipo, miembro);
        assertEquals("kk", equipo.getMembers().get(0).getName());
    }

    @Test
    public void eliminarMiembro(){
        equipo = new Equipo("kk", "kk", 10, "kk", true, members);
        miembro = new Miembro("kk", 13,"kk", powers);

        equipo.crearMiembro(equipo, miembro);

        equipo.eliminarMiembro(equipo, miembro);
        assertEquals(0, equipo.getMembers().size());
    }

    @Test (expected = PWException.class)
    public void eliminarMiembro2(){
        equipo = new Equipo("kk", "kk", 10, "kk", true, members);
        miembro = new Miembro("", 0,"", powers);

        equipo.crearMiembro(equipo, miembro);

        equipo.eliminarMiembro(equipo, miembro);
        assertEquals(0, equipo.getMembers().size());
    }


}