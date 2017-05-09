package main.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        List<String> genList = new ArrayList<>();


        list = genList;
        list.add(1);

        String s = String.valueOf(genList.get(0));
    }
}
