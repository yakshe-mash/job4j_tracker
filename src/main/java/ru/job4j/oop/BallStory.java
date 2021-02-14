package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayac = new Hare();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        volk.tryEat(kolobok);
        zayac.tryEat(kolobok);
        lisa.tryEat(kolobok);
        lisa.eat(kolobok);
    }
}
