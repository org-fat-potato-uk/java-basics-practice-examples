package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    @Test
    void testSumList() {
        assertEquals(10, utils.sumList(List.of(1, 2, 3, 4)));
        assertEquals(0, utils.sumList(List.of()));
    }

    @Test
    void testContainsNumberTrue() {
        assertTrue(utils.containsNumber(List.of(1, 2, 3), 2));
    }

    @Test
    void testContainsNumberFalse() {
        assertFalse(utils.containsNumber(List.of(1, 2, 3), 5));
    }

    @Test
    void testFindMax() {
        assertEquals(7, utils.findMax(List.of(1, 5, 7, 3)));
    }
}