package BuilderPattern;

public class CreateMilitaryCar extends CarBuilder {

    @Override
    public void setModel() {
        car.setModel(Model.HASKI);
    }

    @Override
    public void setSerialNumber() {
        car.setSerialNumber(22154);
    }

    @Override
    public void setSits() {
       car.setSits(5);
    }

    @Override
    public void setWepons() {
        car.setWepons(Wepon.ABRAMS);
    }
}
