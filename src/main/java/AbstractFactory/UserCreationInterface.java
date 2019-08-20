package AbstractFactory;

import AbstractFactory.ChairObjects.Chair;
import AbstractFactory.CoffeTableObjects.CoffeTable;
import AbstractFactory.Factories.IAbstractFactory;

public class UserCreationInterface {
    Chair chair;
    CoffeTable coffeTable;

    public UserCreationInterface(IAbstractFactory factory){
        chair = factory.createChair();
        coffeTable = factory.createCoffeeTable();
    }

    public void info(){
        chair.hasLegs();
        chair.sitOn();
        System.out.println("\n\n");
        coffeTable.hasLegs();
        coffeTable.holdCoffee();
    }
}
