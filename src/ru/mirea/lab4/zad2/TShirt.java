package ru.mirea.lab4.zad2;

public class TShirt extends Clothes{


    public TShirt(Size size, int price, String color) {
        this.s = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("TShirt Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }

    @Override
    public void dressMen() {
        System.out.println("TShirt Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }
}
