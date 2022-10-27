package ru.mirea.lab4.zad3;

public enum Clothes {
    TSHIRT("Tshirt", 1000),
    PANTS("Pants", 2000),
    JACKET("Jacket", 5000),
    SWEATER("Sweater", 3000),
    COAT("Coat", 10000);

    private String info;
    private int price;
    Clothes(String info, int price) {
        this.info = info;
        this.price = price;

    }

    public static void cloAll(){
        for(Clothes x: Clothes.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }

    public static Product cloSearch(String s){
        Product product = new Product();
        for(Clothes x: Clothes.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }



}
