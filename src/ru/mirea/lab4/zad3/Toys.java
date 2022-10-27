package ru.mirea.lab4.zad3;

public enum Toys {
    AUTO("Auto", 500),
    DOLL("Doll", 3000),
    SOFTTOYS("Soft toys", 1500),
    DESIGNER("Designer", 10000);

    private String info;
    private int price;
    Toys(String info, int price){
        this.info = info;
        this.price = price;
    }

    public static void toyAll(){
        for(Toys x: Toys.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }
    public static Product search(String s){
        Product product = new Product();
        for(Toys x: Toys.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }
}
