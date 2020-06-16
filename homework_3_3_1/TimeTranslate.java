package ru.innopolis.university.mingaleev.homework_3_3_1;

import java.util.Scanner;

public class TimeTranslate {

    public static final int SECONDS_IN_HOUR = 3600;

    public static void translate() {
        System.out.println("Введите количество секунд :");
        Scanner in = new Scanner(System.in);
        int clock = in.nextInt();
        int total = (clock / SECONDS_IN_HOUR);
        System.out.println("В часах:" + total);
    }
}
