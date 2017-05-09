package main.generics;

public class Main {

	public static void main(String[] args) {
		WithVersion<String> stringWithVersion = new WithVersion<>("Value", 1);
		WithVersion<Integer> integerWithVersion = new WithVersion<>(new Integer(0), 1);
		TwoThingsWithVersion<String, Integer> things =
				new TwoThingsWithVersion<>(stringWithVersion, new WithVersion<>(new Integer(1), 1));
		System.out.println(stringWithVersion.toString());
		System.out.println(integerWithVersion.toString());
		System.out.println(things.toString());

		Class sss = stringWithVersion.getClass();
		Class aaa = integerWithVersion.getClass();
		String ddd = "Hello";

		System.out.println(sss == aaa);
		System.out.println(sss.equals(aaa));
	}
}
