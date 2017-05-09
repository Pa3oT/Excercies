package main.pattern.strategy.one;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Duck> duckList = new ArrayList<>();
		duckList.add(new MallardDuck());
		duckList.add(new RedHeadDuck());
		duckList.add(new RubberDuck());
		duckList.add(new DecoyDuck());
		duckList.add(new ModelDuck());

		for (Duck duck: duckList) {
			duck.performQuack();
		}
	}
}
