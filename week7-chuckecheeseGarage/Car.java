public class Car {
    private String make, model;
    private int year;

    private String damageNotes;

    void setModel(String model) {
        this.model = model;
    }

    void setDamageNotes(String damageNotes) {
        this.damageNotes = damageNotes;
    }

    public String toString() {
        return "Car model " + model + " with damage: " + damageNotes;
    }
}
