package week2.weblab;

import static org.junit.Assert.*;

import org.junit.*;

public class CloningArraysTest2020 {


    @Test
    public void cloneEmpty() {
        double[][] empty = new double[0][0];
        double[][] clone = CloningArrays2020.clone(empty);
        assertEquals(empty.length, clone.length);
    }

    @Test
    public void cloneSingle() {
        double[][] array = {{1.5}};
        double[][] clone = CloningArrays2020.clone(array);
        assertEquals(array.length, clone.length);
        assertEquals(array[0].length, clone[0].length);
        assertEquals(array[0][0], clone[0][0], 0);
    }

    @Test
    public void cloneSingleIfOneSubEmpty() {
        double[][] array = {{}, {1.5}};
        double[][] clone = CloningArrays2020.clone(array);
        assertEquals(array.length, clone.length);
        assertEquals(array[0].length, clone[0].length);
        assertEquals(array[1][0], clone[1][0], 0);
    }

    @Test
    public void cloneLonger() {
        double[][] array = {{1.5, -10.3, 0}, {-2.5, 8, 1.3}};
        double[][] clone = CloningArrays2020.clone(array);
        assertEquals(array.length, clone.length);
        assertEquals(array[0].length, clone[0].length);
        assertEquals(array[0][0], clone[0][0], 0);
        assertEquals(array[0][1], clone[0][1], 0);
        assertEquals(array[0][2], clone[0][2], 0);
        assertEquals(array[1][0], clone[1][0], 0);
        assertEquals(array[1][1], clone[1][1], 0);
        assertEquals(array[1][2], clone[1][2], 0);
    }


    @Test
    public void cloneDiffSubArraySize() {
        double[][] array = {{-10.3, 0}, {-2.5, 8, 0}};
        double[][] clone = CloningArrays2020.clone(array);
        assertEquals(array.length, clone.length);
        assertEquals(array[0].length, clone[0].length);
        assertEquals(array[1].length, clone[1].length);
        assertEquals(array[0][0], clone[0][0], 0);
        assertEquals(array[0][1], clone[0][1], 0);
        assertEquals(array[1][0], clone[1][0], 0);
        assertEquals(array[1][1], clone[1][1], 0);
        assertEquals(array[1][2], clone[1][2], 0);
    }

    @Test
    public void cloneDiffSubArraySize2() {
        double[][] array = {{-10.3, 0, 2}, {-2.5, 8}};
        double[][] clone = CloningArrays2020.clone(array);
        assertEquals(array.length, clone.length);
        assertEquals(array[0].length, clone[0].length);
        assertEquals(array[1].length, clone[1].length);
        assertEquals(array[0][0], clone[0][0], 0);
        assertEquals(array[0][1], clone[0][1], 0);
        assertEquals(array[0][2], clone[0][2], 0);
        assertEquals(array[1][0], clone[1][0], 0);
        assertEquals(array[1][1], clone[1][1], 0);
    }


}

