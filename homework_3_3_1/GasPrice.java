package ru.innopolis.university.mingaleev.homework_3_3_1;

import java.util.Scanner;

public class GasPrice {
    public static final int GAS_PRICE = 43;

    public static void count() {
        System.out.println("Какое количество литров бензина Вам необходимо? :");
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        float total = (price * GAS_PRICE);
        System.out.println("С Вас: " + total + "руб.");
    }
}

