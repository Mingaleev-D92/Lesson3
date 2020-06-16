package ru.innopolis.university.mingaleev.homework_3_3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + " Попробуй отгадать число заганное ниже)))"
                + ANSI_RESET);
        Random random = new Random();
        int num = random.nextInt(100);

        System.out.println("Загадано число (от 1 до 100) -->" + " " + num
                + "(но ты этого не знаешь)");

        Scanner in = new Scanner(System.in);
        int user1 = in.nextInt();

        int differenceafter1;

        differenceafter1 = num - user1;

            if (user1 == num) {
                System.out.println("Поздравляю!Ты угадал число!");
            } else if (Math.abs(differenceafter1) > num) {
                System.out.println(ANSI_BLUE + "Холодно" + ANSI_RESET);
            } else if (Math.abs(differenceafter1) < num) {
                System.out.println(ANSI_YELLOW + "Горячо" + ANSI_RESET);
            }

        System.out.println(ANSI_PURPLE + "Попробуй еще раз.Загадано число (от 1 до 100)"
                    + ANSI_RESET);
            int user2 = (int) in.nextDouble();

            int differenceafter2;

            differenceafter2 = num - user2;

            if (user2 == num) {
                System.out.println("Поздравляю!Ты угадал число!");
            } else if (Math.abs(differenceafter2) > Math.abs(differenceafter1)) {
                System.out.println(ANSI_BLUE + "Холодно" + ANSI_RESET);
            } else if (Math.abs(differenceafter2) < Math.abs(differenceafter1)) {
                System.out.println(ANSI_YELLOW + "Горячо" + ANSI_RESET);
            }

        }

    }

