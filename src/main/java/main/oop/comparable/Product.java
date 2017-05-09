package main.oop.comparable;

import java.util.*;

public class Product implements Comparable<Product> {
	private double weight;
	private String name;

	public Product(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Product product) {
		if (this.weight > product.weight)
			return 1;
		else if (this.weight < product.weight)
			return -1;
		else return 0;
	}


	public static void main(String args[]) {
		Product fruit1 = new Product(2, "Apple");
		Product fruit2 = new Product(3, "Orange");
		Product fruit3 = new Product(1, "Peace");

			if (fruit1.compareTo(fruit2) > 0) {
			System.out.println(fruit1.name + " is heavy");
		} else {
			System.out.println(fruit2.name + " is heavy");
		}

		List<Product> productList = new ArrayList<>();
		productList.add(fruit1);
		productList.add(fruit2);
		productList.add(fruit3);
		Collections.sort(productList, new WeightComparator());

		for (Product product : productList) {
			System.out.println(product.name);
		}

		List<Integer> integerIterator = new ArrayList<>();
		integerIterator.add(1);
		integerIterator.add(3);
		integerIterator.add(2);

		Comparator<Integer> integerComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer integer, Integer integer2) {
				if (integer > integer2) {
					return 1;
				} else if (integer < integer2){
					return -1;
				} else {
					return 0;
				}
			}
		};
		Collections.sort(integerIterator, integerComparator);

		for(Integer integer : integerIterator) {
			System.out.println(integer);
		}


	}
}

class WeightComparator implements Comparator<Product> {

	@Override
	public int compare(Product product, Product product2) {
		if (product.getWeight() > product2.getWeight()) {
			return 1;
		} else if (product.getWeight() < product2.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}
}

