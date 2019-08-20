package AbstractFactory.Factories;

import AbstractFactory.ChairObjects.Chair;
import AbstractFactory.ChairObjects.ModernChair;
import AbstractFactory.CoffeTableObjects.CoffeTable;
import AbstractFactory.CoffeTableObjects.ModernCoffeeTable;

public class VictorianFactoryI implements IAbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    public void create(){
        createChair();
        createCoffeeTable();
    }
}
