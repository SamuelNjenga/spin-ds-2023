package com.njenga;

import java.util.List;
import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(33);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        List<Integer> stack2 = new Stack<>();
        stack2.add(12);
        stack2.add(13);
        stack2.add(14);
        stack2.add(33);
        System.out.println(stack2.size());
        System.out.println(stack2.size());
        System.out.println(stack2.isEmpty());
    }
}
