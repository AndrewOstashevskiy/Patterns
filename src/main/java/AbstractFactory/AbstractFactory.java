package AbstractFactory;

import AbstractFactory.Factories.IAbstractFactory;
import AbstractFactory.Factories.VictorianFactoryI;

public class AbstractFactory {
    public static void main(String[] args) {
        UserCreationInterface userCreationInterface = new UserCreationInterface(new VictorianFactoryI());
        userCreationInterface.info();
    }
}


