package ru.mirea.lab4.zad1;

public enum Season {
    SUMMER("hot and dry", 30){
        public String getDescription(){
            return "Теплое время года";
        }
    },
    SPRING("slush and comfort", 15),
    WINTER("it's cold and beautiful", -10){
        public String getDescription(){
            return "Холодное время года";
        }
    },
    AUTUMN("Cloudy and atmospheric", 12);



    private String info;
    private int temperature;
    Season(String info, int temperature){
        this.info = info;
        this.temperature = temperature;
    }
    public String getInfo(){
        return name() + "\t" +  info + "\t" + temperature;
    }

    String getDescription(){
        return "";
    }

}
