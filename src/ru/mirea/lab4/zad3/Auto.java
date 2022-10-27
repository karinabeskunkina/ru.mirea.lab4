package ru.mirea.lab4.zad3;

public enum Auto {
    SPAREPART("Sparepart", 5000),
    PAINT("Paint", 2000),
    CARPET("Carpet", 7000),
    TOOL("Tool", 9000);
    private String info;
    private int price;
    Auto(String info, int price){
        this.info = info;
        this.price = price;
    }

    public static void autoAll(){
        for(Auto x: Auto.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }
    public static Product search(String s){
        Product product = new Product();
        for(Auto x: Auto.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }
}
