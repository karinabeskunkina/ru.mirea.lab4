package ru.mirea.lab4.zad3;

public enum Accessorys {
    MIRROR("Mirror", 10000),
    FAN("Fan", 12300),
    TIE("Tie", 9999),
    GLASSES("Glasses", 32000),
    WATCH("Watch", 36000);
    private String info;
    private int price;
    Accessorys(String info, int price){
        this.info = info;
        this.price = price;
    }
    public static void accAll(){
        for(Accessorys x: Accessorys.values()){
            System.out.println(x.info + "\t" + x.price);
        }
    }
    public static Product search(String s){
        Product product = new Product();
        for(Accessorys x: Accessorys.values()){
            if (x.info.equals(s)) {
                product = new Product(x.info, x.price);
            }
        }
        return product;

    }
}
