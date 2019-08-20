package StrategyPattern;

public class DecreesSorting implements ISort{

    @Override
    public int[] sort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
