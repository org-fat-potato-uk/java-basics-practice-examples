package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoopTasksTest {

    LoopTasks loops = new LoopTasks();

    @Test
    void testSumUpTo() {
        assertEquals(15, loops.sumUpTo(5));  // 1+2+3+4+5 = 15
        assertEquals(55, loops.sumUpTo(10)); // 1+2+...+10 = 55
    }

    @Test
    void testCountVowels() {
        assertEquals(2, loops.countVowels("hello"));
        assertEquals(5, loops.countVowels("education"));
        assertEquals(0, loops.countVowels("rhythm"));
    }

    @Test
    void testRepeatString() {
        assertEquals("abcabcabc", loops.repeatString("abc", 3));
        assertEquals("", loops.repeatString("test", 0));
    }
}