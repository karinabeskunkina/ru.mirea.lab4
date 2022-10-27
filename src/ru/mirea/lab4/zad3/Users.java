package ru.mirea.lab4.zad3;

import java.util.ArrayList;
import java.util.HashMap;

public class Users{
    ArrayList<User> users = new ArrayList<>();
    
    
    public void userAdd(User user){
        users.add(user);
    }
    public void userAddBasket(User user, Product product){
        for(User x: users){
            if(user.username.equals(x.username) && user.password.equals(x.password)){
                x.userBasket.add(product);
            }
        }

    }

    public void userSearch(User user){
        int c = 0;
        for(User x: users){
            if(user.username.equals(x.username) && user.password.equals(x.password)){
                System.out.println("Login completed");
                c = 1;
            }
        }
        if(c == 0){
            System.out.println("Invalid username or password");
        }
    }

    public void setUsers(){
        for(User x: users){
            System.out.println("Username: " + x.username);
            x.basketDisplay();
        }
    }

}

