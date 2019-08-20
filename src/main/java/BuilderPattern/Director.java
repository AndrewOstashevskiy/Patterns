package BuilderPattern;

public class Director {

    private CarBuilder carBuilder;

    public void setCarType(CarBuilder carType) {
        carBuilder = carType;
    }

    public Car buildCar() {
        carBuilder.createCar();
        carBuilder.setModel();
        carBuilder.setSerialNumber();
        carBuilder.setSits();
        carBuilder.setWepons();

        Car car = carBuilder.getCar();
        return car;
    }

}
