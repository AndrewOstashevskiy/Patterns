package StrategyPattern;

public class Realisation {
    public static void main(String[] args) {
        int[] n = new int[]{3,1,5,8,4,2,9};
        ChoiseStrategy choiseStrategy = new ChoiseStrategy(new IncreaseSorting());
        int[] ints = choiseStrategy.useStrategy(n);
        iterate(ints);
    }

    public static void iterate(int[] ns){
        for (int n:ns
             ) {
            System.out.println(n);
        }
    }
}
