package ru.mirea.lab4.zad3;

public enum Electronics {
    EARPIECES("Earpieces", 15000),
    LAPTOPS("Laptops", 120000),
    SMARTPHONE("Smartphone", 100000),
    CAMERA("Camera", 50000);
    private String info;
    private int price;
    Electronics(String info, int price){
        this.info = info;
        this.price = price;
    }

    public static void electroAll(){
        for(Electronics x: Electronics.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }
    public static Product search(String s){
        Product product = new Product();
        for(Electronics x: Electronics.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }
}
