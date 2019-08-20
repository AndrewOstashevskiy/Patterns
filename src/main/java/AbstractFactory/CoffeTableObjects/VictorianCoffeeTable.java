package AbstractFactory.CoffeTableObjects;

public class VictorianCoffeeTable implements CoffeTable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian coffee table has legs");
    }

    @Override
    public void holdCoffee() {
        System.out.println("Victorian coffee table can retain coffee");
    }
}
