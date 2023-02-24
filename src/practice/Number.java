package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Number {
    public static void getNumber() {
        // 1 вариант
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Массив чисел: " + Arrays.toString(number));
        int[] numberB = IntStream.rangeClosed(1, number.length)
                .map(i -> number[number.length - i])
                .toArray();
        System.out.println("Обратный массив чисел: " + Arrays.toString(numberB));
    }

        public static void getNumbers() {
        //2 Вариант
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Массив чисел: " + Arrays.toString(numbers));
        Collections.reverse(Arrays.asList(numbers));
        System.out.println("Обратный массив чисел: " + Arrays.toString(numbers));

    }
}
