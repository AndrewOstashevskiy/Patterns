package AbstractFactory.Factories;

import AbstractFactory.ChairObjects.Chair;
import AbstractFactory.CoffeTableObjects.CoffeTable;

public interface IAbstractFactory {
    Chair createChair();
    CoffeTable createCoffeeTable();
}
