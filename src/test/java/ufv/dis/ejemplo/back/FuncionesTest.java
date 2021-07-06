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
    String[] powers;

    @After
    public void after(){
        equipo = new Equipo();
        miembro = new Miembro();
        powers[0] = "kk";
        powers[1] = "kk";
    }

    @Before
    public void before(){}

    @Test
    public void leerJson() {
        equipo = Funciones.leerJson("super.json");
        assertNotEquals("", equipo.getHomeTown());
    }

    @Test
    public void añadirMiembro(){
        @Test
        public void funciones1(){
            miembro = new Miembro("kk", 13,"kk", "kk", );
            localidades.crearLocalidad(localidades, localidad);
            assertEquals("kk", localidades.lista.get(0).getCapital());
        }
    }


}