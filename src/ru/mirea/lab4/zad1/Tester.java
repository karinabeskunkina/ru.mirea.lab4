package ru.mirea.lab4.zad1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Season season_favourite = Season.SUMMER;
        System.out.println(season_favourite.getInfo() + "\n");
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
        System.out.println(season_favourite.name() + "\t" + season_favourite.getDescription() + "\n");
        System.out.println(Season.WINTER.name() + "\t" + Season.WINTER.getDescription() + "\n");
        Season[] season = Season.values();
        for(Season x: season){
            System.out.println(x.getInfo());
        }
    }
}
