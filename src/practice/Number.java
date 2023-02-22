package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Number {
    public static void number(String[] args) {
        // 1 вариант
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(number));
        int[] b = IntStream.rangeClosed(1, number.length)
                .map(i -> number[number.length - i])
                .toArray();
        System.out.println(Arrays.toString(b));
    }

        public static void numbers(String[] args) {
        //2 Вариант
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));
        Collections.reverse(Arrays.asList(numbers));
        System.out.println(Arrays.toString(numbers));

    }
}
