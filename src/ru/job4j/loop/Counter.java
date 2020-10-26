package ru.job4j.loop;
 public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int value = start; value <= finish; value++) {
            sum = sum + value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int answer1 = Counter.sum(0, 10);
        System.out.println(answer1);
        int answer2 = Counter.sum(3, 8);
        System.out.println(answer2);
        int answer3 = Counter.sum(1, 1);
        System.out.println(answer3);
    }
}