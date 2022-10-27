package ru.mirea.lab4.zad1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Season seasonFavourite = Season.SUMMER;
        System.out.println(seasonFavourite.getInfo() + "\n");
        Scanner sourse = new Scanner(System.in);
        Season s = Season.valueOf(sourse.next());
        switch (s){
            case WINTER:
                System.out.println("The time of the year is winter\n");
                break;
            case SPRING:
                System.out.println("The time of the year is spring\n");
                break;
            case SUMMER:
                System.out.println("The time of the year is summer\n");
                break;
            case AUTUMN:
                System.out.println("The time of the year is autumn\n");
                break;
        }
        System.out.println(seasonFavourite.name() + "\t" + seasonFavourite.getDescription() + "\n");
        System.out.println(Season.WINTER.name() + "\t" + Season.WINTER.getDescription() + "\n");
        Season[] season = Season.values();
        for(Season x: season){
            System.out.println(x.getInfo());
        }
    }
}
