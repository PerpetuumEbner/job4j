package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapBorder() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(nums);
        int[] expected = {6, 2, 3, 4, 5, 1};
        Assert.assertArrayEquals(expected, result);
    }
}