package com.caixa.megasena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder {
    private CustomStack<? extends Number> customStack;

    public NumberAscOrder(CustomStack<? extends Number> customStack) {
        this.customStack = customStack;
    }

    public List<Number> sort() {
        if (customStack == null || customStack.isEmpty()) {
            throw new IllegalArgumentException("CustomStack is null or empty");
        }

        List<Number> numbers = new ArrayList<>(customStack.getStack());
        Collections.sort(numbers, (a, b) -> Double.compare(a.doubleValue(), b.doubleValue()));
        return numbers;
    }
}
