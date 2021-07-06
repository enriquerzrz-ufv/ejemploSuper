package ufv.dis.ejemplo.back;

public class Equipo {
    private String squadName;
    private String homeTown;
    private int formed;
    private String secretBase;
    private Boolean active;
    private Miembro[] members;

    // Constructores

    public Equipo(String squadName, String homeTown, int formed, String secretBase, Boolean active, Miembro[] members) {
        this.squadName = squadName;
        this.homeTown = homeTown;
        this.formed = formed;
        this.secretBase = secretBase;
        this.active = active;
        this.members = members;
    }

    public Equipo(){}

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

    public Miembro[] getMembers() {
        return members;
    }

    public void setMembers(Miembro[] members) {
        this.members = members;
    }

    // Métodos


}
