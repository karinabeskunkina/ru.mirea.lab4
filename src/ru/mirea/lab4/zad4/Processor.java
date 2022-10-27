package ru.mirea.lab4.zad4;

public class Processor {
    int numberOfCores;
    int taktFrequency;
    int heatDissipation;
    Processor(int numberOfCores, int taktFrequency, int heatDissipation){
        this.heatDissipation = heatDissipation;
        this.taktFrequency = taktFrequency;
        this.numberOfCores = numberOfCores;
    }

    public String toString(){
        return "Numper of cores \n" + this.numberOfCores + "Takt Frequency \n" + this.taktFrequency + "Heat Dissipation \n" + this.heatDissipation;
    }

}
