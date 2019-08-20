package AbstractFactory.ChairObjects;

public class ModernChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit in Modern Chair");
    }
}
