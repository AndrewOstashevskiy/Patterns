package Lambda;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Andrew", "Georg", "Stanislaw", "Gabriel", "Leonardo"};
       execute(names, (name) -> true);

    }

    private static void execute(String[] names,  Predicate<String> stringPredicate){
        for (String s:names) {
            if (stringPredicate.test(s)){
                System.out.println("Name is: "+s);
            }
        }
    }
}
