package BuilderPattern;

public class CreateSportCar extends CarBuilder{

    @Override
    public void setModel() {
        car.setModel(Model.AUDI);
    }

    @Override
    public void setSerialNumber() {
        car.setSerialNumber(01112);
    }

    @Override
    public void setSits() {
        car.setSits(2);
    }

    @Override
    public void setWepons() {

    }
}
