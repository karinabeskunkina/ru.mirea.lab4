package ru.mirea.lab4.zad2;

import java.util.ArrayList;

public class Atelier {

    public static void dressMen(ArrayList<Clothes> a){
        String info = "Dress Men: ";
        System.out.println(info);
        for (Clothes x: a){
            x.dressMen();
        }
        System.out.println();
    }

    public static void dressWomen(ArrayList<Clothes> a){
        String info = "Dress Women: ";
        System.out.println(info);
        for (Clothes x: a){
            x.dressWomen();
        }
        System.out.println();
    }


    public static void main(String[] args){
        ArrayList<Clothes> clothes= new ArrayList<>();
        clothes.add(new TShirt(Size.S, 1500, "green"));
        clothes.add(new Pants(Size.M, 5000, "black"));
        clothes.add(new Tie(Size.L, 1000, "white"));
        clothes.add(new Skirt(Size.XXS, 2000, "yellow"));
        dressMen(clothes);
        dressWomen(clothes);
    }



}
