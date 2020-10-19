package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return num < 0;
    }

    public static boolean notEvenAndPositive(int num) {
        return (!isEven(num) && isPositive(num));
    }

    public static boolean evenOrNotPositive(int num) {
        return (isEven(num) || !isPositive(num));
    }

    public static void main(String[] args) {
        boolean resl1 = LogicNot.isEven(100);
        System.out.println(resl1);
        boolean resl2 = LogicNot.isPositive(4);
        System.out.println(resl2);
        boolean resl3 = LogicNot.notEven(7);
        System.out.println(resl3);
        boolean resl4 = LogicNot.notPositive(-5);
        System.out.println(resl4);
        boolean resl5 = LogicNot.notEvenAndPositive(9);
        System.out.println(resl5);
        boolean resl6 = LogicNot.evenOrNotPositive(8);
        System.out.println(resl6);
    }
}