package main.pattern.decorator.two;

public class DecoratorNavigator  extends Decorator {
    private int price = 300;
    public DecoratorNavigator(InterfaceComponent c){
        super(c);
    }

    @Override
    public int getPrice() {
        int result =  super.getPrice() + price;
        return result;
    }

    public void getNameParameter(){
        System.out.println("#Navigator");
    }
}
