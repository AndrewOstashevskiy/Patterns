package AbstractFactory.CoffeTableObjects;

public class ModernCoffeeTable implements CoffeTable{

    @Override
    public void hasLegs() {
        System.out.println("Modern coffee table has legs");
    }

    @Override
    public void holdCoffee() {
        System.out.println("Modern coffee table can retain coffee");
    }
}
