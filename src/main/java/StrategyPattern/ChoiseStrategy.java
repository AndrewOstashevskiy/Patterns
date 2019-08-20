package StrategyPattern;

public class ChoiseStrategy {
    ISort iSort;

    public ChoiseStrategy(ISort iSort){
        this.iSort = iSort;
    }

    public int[] useStrategy(int[] ints){
       return iSort.sort(ints);
    }
}
