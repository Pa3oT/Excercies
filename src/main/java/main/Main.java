package main;

public class Main implements Comparable<Main> {
	static int count = 0;
	static int count1 = 0;
	static int count2 = 0;
	static int count3 = 0;

	static int a = 5, b = 7;
	static int c = a+=2*3+b--;

	private Main() {}

	public static void main(String[] args) {
		System.out.println(c);
		System.out.println(--count2);
		System.out.println(count3++);
		System.out.println(count3++);


		for(int i = 1; i < 100; i ++) {
			for(int j = 2; j < 100; j ++) {

			}
		}
	}

	@Override
	public int compareTo(Main main) {
		return 0;
	}
}


class A {
	public String print() {
		return "A";
	}
}
class B extends A {
	public String print() {
		return "B";
	}
}

class C {
	public static void main(String[] args) {
		//B b = new A();
		A a = new B();
	}
}
