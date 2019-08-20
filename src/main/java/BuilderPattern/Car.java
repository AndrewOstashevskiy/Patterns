package BuilderPattern;

public class Car {

    private Model model;
    private int serialNumber;
    private int sits;
    private Wepon wepons;

    public Model getName() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }

    public Model getModel() {
        return model;
    }

    public Wepon getWepons() {
        return wepons;
    }

    public void setWepons(Wepon wepons) {
        this.wepons = wepons;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", serialNumber=" + serialNumber +
                ", sits=" + sits +
                ", wepons=" + wepons +
                '}';
    }
}

