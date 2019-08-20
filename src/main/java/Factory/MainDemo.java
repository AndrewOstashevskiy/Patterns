package Factory;

public class MainDemo {
    public static void main(String[] args) {
        Factory factory = new TruckFactory();
        factory.buissnesLogic();

    }
}

interface Transport{
    void deliver();
}

class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivers by Fly");
    }
}

class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sea");
    }
}

abstract class Factory{

   private Transport transport = createTransport();

    public void buissnesLogic(){
        transport.deliver();
    }

    public abstract Transport createTransport();
}

class ShipFactory extends Factory{


    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class TruckFactory extends Factory{


    @Override
    public Transport createTransport() {
        return new Truck();
    }
}