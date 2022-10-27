package ru.mirea.lab4.zad4;

public class Tester {
    public static void main(String[] args) {
        Computer computer1 = new Computer(Stamp.HP, 55000,
                new Memory(1024, 64, 12),
                new Monitor(23, 250, 144),
                new Processor(6, 3000, 117));
        System.out.println(computer1.toString());
    }
}
