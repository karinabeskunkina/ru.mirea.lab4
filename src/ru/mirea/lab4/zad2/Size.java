package ru.mirea.lab4.zad2;

public enum Size {
    XXS(32){
        public String getDescription(){
            return "Kids size";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;
    Size(int euroSize){
        this.euroSize = euroSize;
    }
    public String getDescription(){
        return "Size Clothes";
    }
}
