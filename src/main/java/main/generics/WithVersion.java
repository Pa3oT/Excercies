package main.generics;

public class WithVersion<T> {
	public T value;
	public long version;

	public WithVersion(T value, long version) {
		this.value = value;
		this.version = version;
	}

	@Override
	public String toString() {
		return "WithVersion{" +
				"value=" + value +
				", version=" + version +
				'}';
	}
}

class TwoThingsWithVersion<A, B> {
	WithVersion<A> frs;
	WithVersion<B> scd;

	TwoThingsWithVersion(WithVersion<A> frs, WithVersion<B> scd) {
		this.frs = frs;
		this.scd = scd;
	}

	@Override
	public String toString() {
		return "TwoThingsWithVersion{" +
				"frs=" + frs +
				", scd=" + scd +
				'}';
	}
}
