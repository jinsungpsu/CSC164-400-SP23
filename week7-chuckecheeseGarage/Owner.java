public class Owner {
    private String name;
    private String phoneNumber;
    private Car car;

    Owner(String name) {
        this.name = name;
    }

    void setCar(Car car) {
        this.car = car;
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Owner name: " + name;
    }
}
