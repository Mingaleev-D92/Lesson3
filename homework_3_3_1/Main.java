package ru.innopolis.university.mingaleev.homework_3_3_1;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
        System.out.println(zdt);
        System.out.println(zdt1);

        System.out.println(String.format("Выберите программу(%s, %s, %s)",
                Programm.GAS.name(), Programm.NDFL.name(), Programm.TIME.name()));
        Scanner scanner = new Scanner(System.in);
        Programm programm = Programm.fromString(scanner.nextLine());
        switch (programm) {
            case GAS:
                GasPrice.count();
                break;
            case TIME:
                TimeTranslate.translate();
                break;
            case NDFL:
                NDFL.payment();
                break;
            default:
                break;
        }
    }

    enum Programm {
        GAS, NDFL, TIME;

        public static Programm fromString(String s) {
            return Programm.valueOf(s.toUpperCase());
        }
    }
}


