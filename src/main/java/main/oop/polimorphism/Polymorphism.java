package main.oop.polimorphism;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
	static List<Parent> list = new ArrayList<>();


	public static void main(String[] args) {
		list.add(new Parent());
		list.add(new Parent.Child());
			for(Parent p: list) {
				p.call();
			}
	}
}
