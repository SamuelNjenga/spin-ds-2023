package com.njenga;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] languages = new String[5];
        languages[0] = "Java";
        languages[1] = "JavaScript";
        System.out.println(Arrays.toString(languages));

        // Another way of defining array
        int[] numbers = {200, 440};
        System.out.println(Arrays.toString(numbers));
        // Loop through array
        // Traditional for loop
        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }
        for (int i = languages.length - 1; i >= 0; i--) {
            System.out.println(languages[i]);
        }

        // Enhanced for loop
        for (String language : languages) {
            System.out.println(language);
        }
        System.out.println("----------");
        // Using streams
        Arrays.stream(languages).forEach(System.out::println);
    }
}
