package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery (int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery fist = new Battery(100);
        Battery second = new Battery(65);
        System.out.println(fist.load + " : " + second.load);
        fist.exchange(second);
        System.out.println(fist.load + " : " + second.load);
    }
}
