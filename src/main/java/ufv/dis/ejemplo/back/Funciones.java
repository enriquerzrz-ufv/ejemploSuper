package ufv.dis.ejemplo.back;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Funciones {
    public static Equipo leerJson(String path){
        // Definimos objeto gson
        Gson gson = new Gson();

        try (Reader reader = new FileReader(path)){
            // Convertimos un archivo Json a objeto de Java
            return gson.fromJson(reader, Equipo.class);

        }catch (IOException e){
            e.printStackTrace();
            return new Equipo();
        }
    }
}
