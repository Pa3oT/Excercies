package main.pattern.decorator.two;

public class DecoratorExample {
    public static void main(String[] args) {
        System.out.println("#### Decorator Example ####");

        Decorator commonprice = new DecoratorNavigator(new DecoratorTitanDisk(new Car()));
        System.out.println(commonprice.getPrice());
    }
}
