package GenericLesson;

public class Box<T> {

    private T object1;
    private T object;

    public void print(){
        System.out.println(object1);
        System.out.println(object);
    }

    public static <T> Box<T> createTwoWallues(Object o1, Object o2){
        Box<T> box = new Box<>();
        box.object = (T)o1;
        box.object1 = (T)o2;
        return box;
    }

    public static void main(String[] args) {
        Double d = 1.443564;
        String s = "sgsdfgz";
        Box<Integer> box = createTwoWallues(s, d);
        box.print();

    }
}
