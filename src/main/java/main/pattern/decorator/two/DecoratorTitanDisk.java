package main.pattern.decorator.two;

public class DecoratorTitanDisk extends Decorator {
    private int price = 2000;
    public DecoratorTitanDisk(InterfaceComponent c){
        super(c);
    }

    @Override
    public int getPrice() {
        int result =  super.getPrice() + price;
        return result;
    }

    public void getNameParameter(){
        System.out.println("#TitanDisk");
    }
}
