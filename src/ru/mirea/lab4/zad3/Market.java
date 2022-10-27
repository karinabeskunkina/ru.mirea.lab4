package ru.mirea.lab4.zad3;

import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users users = new Users();
        String ss = "avtoriz";
        String string = "no";
        User user1 = new User();
        String catalog = "";
        while (string.equals("no")) {
            if (ss.equals("avtoriz")) {
                user1 = login(user1, users);
                System.out.println("Komand: avtoriz, inCatalog, add, buy ");
                ss = sc.nextLine();
            }
            if (ss.equals("inCatalog") || ss.equals("add")) {

                if(ss.equals("add") != true) {
                    Catalog.catalogAll();
                    System.out.println("Select a folder");
                    catalog = sc.nextLine();
                    podCatalog(catalog);
                    System.out.println("Komand: avtoriz, inCatalog, add, buy");
                    ss = sc.nextLine();
                }
                if (ss.equals("add")) {
                    addProduct(catalog, user1, users);
                    System.out.println("Komand: avtoriz, inCatalog, add, buy");
                    ss = sc.nextLine();
                }
            }
            if (ss.equals("buy")) {
                buy(user1);
                System.out.println("Komand: avtoriz, inCatalog, add, buy");
                ss = sc.nextLine();
                System.out.println("Exit?");
                string = sc.nextLine();

            }
        }
        users.setUsers();

    }

    public static User login(User user1, Users users){
        Scanner sc = new Scanner(System.in);
        System.out.println("Registration or login");
        String login = sc.nextLine();
        System.out.println("Enter the username");
        String username = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        user1 = new User(username, password);
        if (login.equals("login")) {
            users.userSearch(user1);
        } else {
            users.userAdd(user1);
        }
        return user1;
    }

    public static void buy(User user1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to see the shopping cart");
        String s2 = sc.nextLine();
        if(s2.equals("yes")){
            user1.basketDisplay();
        } else {
            user1.basketSumm();
        }
    }

    public static void addProduct(String catalog, User user1, Users users){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String s = sc.nextLine();
        Product product = new Product();

        switch (catalog) {
            case "CLOTHES":
                product = Clothes.cloSearch(s);
                break;
            case "SHOES" :
                product = Shoes.search(s);
                break;
            case "ACCESSORYS" :
                product = Accessorys.search(s);
                break;
            case "ELECTRONICS" :
                product = Electronics.search(s);
                break;
            case "TOYS" :
                product = Toys.search(s);
                break;
            case "SPORT" :
                product = Sport.search(s);
                break;
            case "AUTO" :
                product = Auto.search(s);
                break;
            default :
                System.out.println("There is no such directory");
        }
        podCatalog(catalog);
        users.userAddBasket(user1, product);

    }
    public static void podCatalog(String catalog){
        switch (catalog) {
            case "CLOTHES" -> Clothes.cloAll();
            case "SHOES" -> Shoes.ShoAll();
            case "ACCESSORYS" -> Accessorys.accAll();
            case "ELECTRONICS" -> Electronics.electroAll();
            case "TOYS" -> Toys.toyAll();
            case "SPORT" -> Sport.sportAll();
            case "AUTO" -> Auto.autoAll();
            default -> System.out.println("There is no such directory");
        }

    }



}
