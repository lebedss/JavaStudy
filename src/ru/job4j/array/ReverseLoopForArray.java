package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int n : numbers) {
            if ((n % 2) == 0) {
                System.out.println(
                        "Чётный элемент массива: "
                                + n);
            }
        }
    }
}
