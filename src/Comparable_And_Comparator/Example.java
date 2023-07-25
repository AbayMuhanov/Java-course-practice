package Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Petya");
        names.add("Sasha");
        names.add("Masha");

        Collections.sort(names);
        System.out.println(names);


    }
}
