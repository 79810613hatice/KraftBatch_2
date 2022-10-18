package day_48_Collection;

import java.util.Stack;

public class Stack_Example {

    public static void main(String[] args) {
        Stack<Object> stack=new Stack<>();

        stack.add(true);
        stack.add(5);
        stack.add("merhaba");
        stack.add('C');
        stack.add(8.8);
        System.out.println(stack.pop());


    }
}
