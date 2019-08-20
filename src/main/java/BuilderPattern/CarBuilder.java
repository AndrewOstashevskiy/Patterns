package BuilderPattern;

public abstract class CarBuilder {
    Car car;

    public void createCar(){
        car = new Car();
    }

    public Car getCar(){
        return car;
    }

    public abstract void setModel();
    public abstract void setSerialNumber();
    public abstract void setSits();
    public abstract void setWepons();

}
