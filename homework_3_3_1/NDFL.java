package ru.innopolis.university.mingaleev.homework_3_3_1;

import java.util.Scanner;

public class NDFL {
    public static final double NDFL = 0.13;

    public static void payment() {
        System.out.println("Введите Вашу зарплату:");
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        double total = (salary * NDFL);
        double total1 = salary - total;
        System.out.println("Зарплата на руки (c учетов 13%(НДФЛ)): " + total1 + "руб.");
    }
}
