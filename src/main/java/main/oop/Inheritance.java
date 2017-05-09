package main.oop;

public class Inheritance {
	public static void main(String args[]) {
//		A a = new C();
//		B b = new B();
//		A c = new A();
//		a.test();
//		b.test();
//		c.test();

		B b = new B(1, "Sergey", " LA");
		System.out.println( b.toString());
	}
}

class A {
	String name;
	int id;

	A(int id, String name) {
		this.id = id;
		this.name = name;
	}

	static { System.out.println("A static"); }

	{ System.out.println("A block"); }

	@Override
	public String toString() { return "A{" + "name='" + name + ", id=" + id + '}';}

	public static void test() {
		System.out.println("A test");
	}

	public Number calc() throws Exception {
		return 1;
	}
}

class B extends A {
	String adress;
	B(int id, String name, String adress) {
		super(id, name);
		this.adress = adress;
	}

	static { System.out.println("B static"); }

	{ System.out.println("B block"); }

	@Override
	public String toString() { return super.toString() + "B{" + "adress= " + adress + '}'; }

	public static void test() {
		System.out.println("B test");
	}

	@Override
	public Integer calc() throws RuntimeException {
		return 2;
	}
}

class C extends A {

	static { System.out.println("C static"); }

	{ System.out.println("C block"); }

	C(int id, String name) { super(id, name); }

	public static void test() {
		System.out.println("C test");
	}
}