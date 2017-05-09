package main.oop;

public class InitialBlock {
	public static void main(String[] args) {
		Child refChild = new Child();
		Parent refParent = refChild;

		refChild.field = 1;
		refParent.field = 2;

		System.out.println(refChild.field);
		System.out.println(refParent.field);
	}
}


class Parent {
	int field;

	void f() {
		System.out.println("Parent:f");
	}
}

class Child extends Parent {
	int field;

	void f() {
		System.out.println("Child:f");
	}
}