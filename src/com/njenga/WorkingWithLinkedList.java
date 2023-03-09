package com.njenga;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Shaunie", 24));
        linkedList.add(new Person("Keion", 76));
        linkedList.addFirst(new Person("Luzi", 64));
        linkedList.addLast(new Person("Suzzie", 19));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println("--------------");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }
    }
}
