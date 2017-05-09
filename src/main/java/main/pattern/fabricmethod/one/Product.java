package main.pattern.fabricmethod.one;

public abstract class Product {}
class ProductA extends Product {}
class ProductB extends Product {}
abstract class Creator { abstract Product fabricMethod(); }
class CreatorProductA extends Creator {
    @Override
    public Product fabricMethod() {
        return new ProductA();
    }
}
class CreatorProductB extends Creator {
    @Override
    public Product fabricMethod() {
        return new ProductB();
    }
}
class FactoryMethodTest {
    public static void main(String[] args) {
        Creator[] creators = {new CreatorProductA(), new CreatorProductB()};
        for(Creator creator: creators) {
            Product product = creator.fabricMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}