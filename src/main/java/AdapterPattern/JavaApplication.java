package AdapterPattern;

public class JavaApplication implements IJavaApp {

    @Override
    public void saveObject() {
        System.out.println("Saving object...");
    }

    @Override
    public void updateObject() {
        System.out.println("Updating object...");
    }

    @Override
    public void deleteObject() {
        System.out.println("Deleting object...");
    }
}
