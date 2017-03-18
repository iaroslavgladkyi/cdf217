package oop.an_intefaces.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by codefire on 18.03.17.
 */
public class ArraysSortDemo {
    public static void main(String[] args) {
        Integer[] numbers = {4, 2, 9, 4, 6, 1};
        /*Comparator c = ...;
        Arrays.sort(numbers, c);*/
        Arrays.sort(numbers);
        String line = Arrays.toString(numbers);
        System.out.println(line);

    }
}
