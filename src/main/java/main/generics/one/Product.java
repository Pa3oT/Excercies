package main.generics.one;

public abstract class Product<T extends Product<T>> implements Comparable<T> {
    String name;
    int price;

    @Override
    public int compareTo(T product) {
       if(this.price != product.price)
           return Integer.compare(this.price, product.price);
        return 0;
    }

    abstract void subCompare(T product);
}
