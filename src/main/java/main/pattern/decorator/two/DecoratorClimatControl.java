package main.pattern.decorator.two;

public class DecoratorClimatControl  extends Decorator {
    private int price = 1500;

    public DecoratorClimatControl(InterfaceComponent c){
            super(c);
        }

        @Override
        public int getPrice() {
            int result =  component.getPrice() + price;
            return result;
        }

        public void getNameParameter(){
            System.out.println("#ClimatControl");
        }
}
