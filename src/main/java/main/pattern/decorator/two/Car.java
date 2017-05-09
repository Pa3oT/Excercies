package main.pattern.decorator.two;

public class Car implements InterfaceComponent {
    @Override
    public int getPrice() {
        return 6000;
    }

    public void move() {
        System.out.print("I am car");
    }
}
