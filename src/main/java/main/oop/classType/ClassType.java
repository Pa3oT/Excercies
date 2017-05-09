package main.oop.classType;

public class ClassType {
	class InnerI {
	}
}

class Test {
	public static void main(String[] args) {
		ClassType n = new ClassType();
		ClassType.InnerI i = new ClassType().new InnerI();
	}
}
