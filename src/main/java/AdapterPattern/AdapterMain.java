package AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {


        DataBase dataBase1 = new DataBaseRunner();
        dataBase1.remove();
        dataBase1.select();
        dataBase1.incert();

        System.out.println("Adaptered: ");

        DataBase dataBase = new AdapterJavaToDatabase();
        dataBase.remove();
        dataBase.select();
        dataBase.incert();
    }
}
