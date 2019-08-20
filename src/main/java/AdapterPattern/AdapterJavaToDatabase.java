package AdapterPattern;

public class AdapterJavaToDatabase extends JavaApplication implements DataBase {
    @Override
    public void incert() {
        updateObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void select() {
        saveObject();
    }
}
