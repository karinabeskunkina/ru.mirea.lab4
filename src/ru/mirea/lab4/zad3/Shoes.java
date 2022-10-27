package ru.mirea.lab4.zad3;

public enum Shoes {
    BOOTS("Boots", 5000),
    SANDALS("Sandals", 3000),
    SNEAKERS("Sneakers", 4000);

    private String info;
    private int price;
    Shoes(String info, int price){
        this.info = info;
        this.price = price;
    }

    public static void ShoAll(){
        for(Shoes x: Shoes.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }
    public static Product search(String s){
        Product product = new Product();
        for(Shoes x: Shoes.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }
}
