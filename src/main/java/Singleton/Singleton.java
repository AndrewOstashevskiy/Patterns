package Singleton;

public class Singleton {
    private static Singleton singleton;
    private String string;

    public String getString() {
        return string;
    }

    private Singleton(String val){
        string = val;
    }

    public static Singleton getInstance(String val){
        if (singleton == null){
            singleton = new Singleton(val);
        }
        return singleton;
    }
}
