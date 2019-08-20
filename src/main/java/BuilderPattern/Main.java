package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarType(new CreateSportCar());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
