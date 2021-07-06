package ufv.dis.ejemplo.back;

public class Miembro {
    private String name;
    private int edad;
    private String secretIdentity;
    private String powers[];

    // Constructores

    public Miembro(String name, int edad, String secretIdentity, String[] powers) {
        this.name = name;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public String[] getPowers() {
        return powers;
    }

    public void setPowers(String[] powers) {
        this.powers = powers;
    }


    // Métodos


}
