package Project;

public class AircraftClass {
    private String maker;
    private String model;
    private int capacity;

    public AircraftClass(String maker, String model, int capacity) {
        this.maker = maker;
        this.model = model;
        this.capacity = capacity;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
