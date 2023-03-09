package com.njenga;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of("blue", "yellow");
       // colorsUnmodifiable.add("red"); -> Results in an error
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Green");
        System.out.println(colors.size());
        System.out.println(colors.contains("Green"));
        System.out.println(colors.contains("Pink"));
        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }
        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
