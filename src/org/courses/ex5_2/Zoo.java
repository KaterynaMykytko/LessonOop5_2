package org.courses.ex5_2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.ensureCapacity(8);
        list.add(0, "Elephant");
        list.add(1,"Tiger");
        list.add(2,"Lion");
        list.add(3,"Giraffe");
        list.add(4,"Monkey");
        list.add(5,"Lion");
        list.add(6,"Zebra");
        list.add(7,"Camel");

        System.out.println(list);
    }
}
