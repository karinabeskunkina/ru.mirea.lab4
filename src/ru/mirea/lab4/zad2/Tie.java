package ru.mirea.lab4.zad2;

public class Tie extends Clothes {

    MenClothing menClothing;

    public Tie(Size size, int price, String color) {
        this.s = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressMen() {
        System.out.println("Tie Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }
}
