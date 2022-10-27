package ru.mirea.lab4.zad3;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    ArrayList<Product> userBasket = new ArrayList<>();
    User(){};
    User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void userBasketAdd(Product product){
        userBasket.add(product);
    }
    public void basketDisplay(){
        int sum = 0;
        for(Product x: userBasket) {
            System.out.println(x.name + " " + x.price);
            sum += x.price;
        }
        System.out.println("Summa " + sum);
    }

    public String basketSumm(){
        int sum = 0;
        for(Product x: userBasket) {
            sum += x.price;
        }
        System.out.println("Summa " + sum);
        return "Summa " + sum;
    }


}
