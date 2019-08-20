package Polymorphism;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Sedan();
        transport.move();

        Transport transport1 = new Tank();
        transport1.move();
    }
}
