package com.njenga;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMapsTwo {
    public static void main(String[] args) {
        Map<User, Diamond> map = new HashMap<>();
        map.put(new User("Sammy"), new Diamond("Diamond A"));
        System.out.println(new User("Sammy").hashCode());
        System.out.println(new User("Sammy").hashCode());
        System.out.println(new User("Sammy"));
        System.out.println(map.get(new User("Sammy")));
    }

    public static class Diamond {
        private final String name;

        public Diamond(String name) {
            this.name = name;
        }

        public String toString() {
            return "Diamond [name=" + name + "]";
        }
    }

    public static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        public String toString() {
            return "Person [name=" + name + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
