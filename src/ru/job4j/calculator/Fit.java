package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height1) {
        return ((height1 - 100) * 1.15);
    }

    public static double womanWeight(double height2) {
        return ((height2 - 110) * 1.15);
    }

    public static void main(String[] args) {
        double height1 = 177;
        double height2 = 161.9;
        double man = Fit.manWeight(height1);
        double woman = womanWeight(height2);
        System.out.println("Man is " + man + " kgs");
        System.out.println("Woman is " + woman + " kgs");
    }
}