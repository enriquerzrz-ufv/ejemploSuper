package ufv.dis.ejemplo.back;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.WeakHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FuncionesTest {
    Equipo equipo;
    Miembro miembro;

    @After
    public void after(){
        equipo = new Equipo();
        miembro = new Miembro();
    }

    @Before
    public void before(){}

    @Test
    public void leerJson() {
        equipo = Funciones.leerJson("super.json");
        assertNotEquals("", equipo.getHomeTown());
    }
}