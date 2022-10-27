package ru.mirea.lab4.zad4;

public class Memory {
    int memoryreadonly;
    int memoryreadrecord;
    int speed;

    Memory(int memoryreadonly, int memoryreadrecord, int speed){
        this.memoryreadonly = memoryreadonly;
        this.memoryreadrecord = memoryreadrecord;
        this.speed = speed;
    }
    public String toString(){
        return "Memory read only \n" + this.memoryreadonly + "Memory read-record \n" + this.memoryreadrecord + "Speed \n" + this.speed;
    }

}
