package com.njenga;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Jersey> jerseys = new HashSet<>();
        jerseys.add(new Jersey("blue"));
        jerseys.add(new Jersey("yellow"));
        jerseys.add(new Jersey("red"));
        jerseys.add(new Jersey("red"));
        jerseys.remove(new Jersey("blue"));
        jerseys.forEach(System.out::println);
    }

    public static class Jersey {
        private final String color;

        public Jersey(String color) {
            this.color = color;
        }

        public String toString() {
            return "Jersey [color=" + color + "]";
        }

        // override equals method and hashcode for set to work correctly
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Jersey jersey = (Jersey) o;
            return Objects.equals(color, jersey.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }
}
