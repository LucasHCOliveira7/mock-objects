package com.caixa.megasena;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberAscOrderTest {

    @Test
    void testSortWithNumbers() {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(42);
        stack.push(7);
        stack.push(19);
        stack.push(23);
        stack.push(3);
        stack.push(15);

        NumberAscOrder numberAscOrder = new NumberAscOrder(stack);
        List<Number> sortedNumbers = numberAscOrder.sort();

        assertEquals(Arrays.asList(3, 7, 15, 19, 23, 42), sortedNumbers);
    }

    @Test
    void testSortWithEmptyStack() {
        CustomStack<Integer> stack = new CustomStack<>();
        NumberAscOrder numberAscOrder = new NumberAscOrder(stack);

        Exception exception = assertThrows(IllegalArgumentException.class, numberAscOrder::sort);
        assertEquals("CustomStack is null or empty", exception.getMessage());
    }
}
