package main.pattern.delegate;

class Hands {
    public void chop() {
        System.out.println("Рубить");
    }
}

class Legs {
    public void jump() {
        System.out.println("Прыгать");
    }
}

public class Man {
    private Hands hands = new Hands();
    private Legs legs = new Legs();

    public void chop() {
        hands.chop();
    }

    public void jump() {
        legs.jump();
    }
}