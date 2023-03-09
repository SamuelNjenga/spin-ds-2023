package com.njenga;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Samuel"));
        map.put(2, new Person("Ivy"));
        map.put(3, new Person("Tammy"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(2);
        map.entrySet().forEach(System.out::println);
        // lambda
        map.entrySet().forEach(x -> System.out.println(x));
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " +x.getValue()));
        map.forEach((key,person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(2,new Person("default")));
        System.out.println(map.values());
    }

    public static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String toString() {
            return "Person [name=" + name + "]";
        }
    }
}
