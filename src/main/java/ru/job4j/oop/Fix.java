package ru.job4j.oop;

public class Fix {
    private String desc;

    Fix(String text){
        this.desc = text;
    }

    public static void main(String[] args) {
        Fix bug = new Fix("text");
    }
}
