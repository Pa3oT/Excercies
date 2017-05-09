package main.oop.polimorphism;

public class Parent {
	public void call() {
		System.out.println("Class Parent - method call");
	}

	static class Child extends Parent {
		public void call() {
			System.out.println("Class Child - method call");
		}
	}
}


