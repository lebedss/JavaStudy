package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
         int rsl = first >= second ? first : second;
         return rsl >= third ? rsl : third;
        }

    public static void main(String[] args) {
        int value1 = MultiMax.max(4, 1, 2);
        System.out.println(value1);
        int value2 = MultiMax.max(1, 4, 2);
        System.out.println(value2);
        int value3 = MultiMax.max(1, 2, 4);
        System.out.println(value3);
        int value4 = MultiMax.max(2, 2, 2);
        System.out.println(value4);
    }
}
