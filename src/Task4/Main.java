package Task4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {7, 2, 15, 1, 9};

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        for (Integer number : numbers) {
            System.out.println(number);
        }


    }

}