package AdapterPattern;

public class DataBaseRunner implements DataBase{

    @Override
    public void incert() {
        System.out.println("Database incert");
    }

    @Override
    public void remove() {
        System.out.println("Database remove");
    }

    @Override
    public void select() {
        System.out.println("Database select");
    }
}
