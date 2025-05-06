package com.caixa.megasena;

import java.util.Stack;

public class CustomStack<T> {
    private Stack<T> stack = new Stack<>();

    public void push(T item) {
        stack.push(item);
    }

    public T pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public Stack<T> getStack() {
        return stack;
    }
}
