package ru.mirea.lab4.zad3;

public enum Sport {
    TRAINER("Trainer", 50000),
    SCOOTER("Scooter", 11000),
    SKI("Ski", 8000);

    private String info;
    private int price;
    Sport(String info, int price){
        this.info = info;
        this.price = price;
    }

    public static void sportAll(){
        for(Sport x: Sport.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }
    public static Product search(String s){
        Product product = new Product();
        for(Sport x: Sport.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }
}
