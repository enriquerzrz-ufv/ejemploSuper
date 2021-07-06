package ufv.dis.ejemplo.back;

import java.util.ArrayList;

public class Miembro {
    private String name;
    private int age;
    private String secretIdentity;
    private ArrayList<String> powers;

    // Constructores

    public Miembro(String name, int age, String secretIdentity, ArrayList<String>  powers) {
        this.name = name;
        this.age = age;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }

    public Miembro(){}

    //Getters && Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }


    // Métodos


}
