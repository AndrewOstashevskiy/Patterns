package GenericLesson;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Integer> list = Arrays.asList(44,55,66,77,88);
        Object[] o = new Object[2];
        o[0] = list;

        for (Object o1:o) {
            System.out.println(o1);
        }
    }

    private static <T> void fill(List<T> list, T element) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, element);
        }
    }

    private static int sum(Integer... n) {
        int res = 0;
        for (Integer integer : n) {
            res = res + integer;
        }
        return res;
    }
}
