package ufv.dis.ejemplo.back;

import java.util.ArrayList;

public class Equipo {
    private String squadName;
    private String homeTown;
    private int formed;
    private String secretBase;
    private Boolean active;
    private ArrayList<Miembro> members = new ArrayList<>();

    // Constructores

    public Equipo(String squadName, String homeTown, int formed, String secretBase, Boolean active, ArrayList<Miembro> members) {
        this.squadName = squadName;
        this.homeTown = homeTown;
        this.formed = formed;
        this.secretBase = secretBase;
        this.active = active;
        this.members = members;
    }

    public Equipo() {
    }

    // Getters && Setters

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getFormed() {
        return formed;
    }

    public void setFormed(int formed) {
        this.formed = formed;
    }

    public String getSecretBase() {
        return secretBase;
    }

    public void setSecretBase(String secretBase) {
        this.secretBase = secretBase;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ArrayList<Miembro> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Miembro> members) {
        this.members = members;
    }

    // Métodos
    public void crearMiembro(Equipo equipo, Miembro miembro) {
        if (miembro == null || miembro.getName().equals("") || miembro.getAge() == 0 || miembro.getSecretIdentity().equals("") || miembro.getPowers().length == 0) {
            throw new PWException("ERROR");
        } else {
            equipo.members.add(members.size(), miembro);
        }
    }

    public void eliminarMiembro (Equipo equipo, Miembro miembro){
        if (equipo == null || miembro == null)
            throw new PWException("ERROR");
        else{
            equipo.members.removeIf(m -> m == miembro);
        }
    }
}
