package ru.mirea.lab4.zad2;

public class Skirt extends Clothes{

    WomenClothing womenClothing;

    public Skirt(Size size, int price, String color) {
        this.s = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }

}
