package main.generics;

public class Main1 {
	public static void main(String[] args) {
		WithVersionT<String> wv1 = new WithVersionT<>("A", 1);
		WithVersionT<String> wv2 = new WithVersionT<>("B", 1);
	}
}

class WithVersionT<T extends  Comparable<T>> implements Comparable<T> {
	public T value;
	public long version;

	WithVersionT(T value, long version) {
		this.value = value;
		this.version = version;
	}

	@Override
	public int compareTo(T that) {
		return this.compareTo(that);
	}
}
