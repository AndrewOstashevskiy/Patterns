package Singleton;

public class MainSingltone {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("aaa");
        System.out.println(singleton.getString());
        Singleton singleton1 = Singleton.getInstance("gswrerdg");
        System.out.println(singleton1.getString());
    }
}
