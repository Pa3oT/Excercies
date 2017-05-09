package main.pattern.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by user on 28.06.2014.
 */
public class IteratorPattern {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3);
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		ListIterator<Integer> listIterator = list.listIterator();
	}
}
