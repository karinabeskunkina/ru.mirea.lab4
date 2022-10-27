package ru.mirea.lab4.zad4;

public class Monitor {
    float diagonal;
    int brightness;
    int frequency;
    Monitor(float diagonal, int brightness, int frequency){
        this.brightness = brightness;
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    public String toString(){
        return "Diagonal\n" + this.diagonal + "Brightness \n" + this.brightness + "Frequency\n" + this.frequency;
    }

}
