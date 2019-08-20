package AbstractFactory.ChairObjects;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit in victorian Chair");
    }
}
