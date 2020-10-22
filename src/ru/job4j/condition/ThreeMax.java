package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;

        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }

    public static void main(String[] args) {
        int value1 = ThreeMax.max(10, 5, 1);
        System.out.println(value1);
        int value2 = ThreeMax.max(10, 50, 1);
        System.out.println(value2);
        int value3 = ThreeMax.max(1, 5, 100);
        System.out.println(value3);
        int value4 = ThreeMax.max(1, 1, 1);
        System.out.println(value4);
        int value5 = ThreeMax.max(10, 10, 1);
        System.out.println(value5);
        int value6 = ThreeMax.max(100, 10, 100);
        System.out.println(value6);
        int value7 = ThreeMax.max(1, 100, 100);
        System.out.println(value7);
    }
}