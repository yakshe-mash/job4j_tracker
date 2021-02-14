package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load){
        this.load = load;
    }

    public void exchange(Battery another){
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(40);
        Battery another = new Battery(40);
        System.out.println(first.load + " " + another.load);
        first.exchange(another);
        System.out.println(first.load + " " + another.load);
    }

}
