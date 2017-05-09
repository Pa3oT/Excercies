package main.pattern.decorator.two;

abstract public class Decorator implements InterfaceComponent {
    protected InterfaceComponent component;
    private int price = 0;

    public Decorator (InterfaceComponent c){
        component = c;
    }

    public int getPrice(){
        price = component.getPrice();
        return price;
    }
}
