package com.bourdk.math.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.bourdk.alloc.IntegerModAllocator;
import com.bourdk.exceptions.ModuloException;
import com.bourdk.exceptions.OperationException;
import com.bourdk.math.IntegerModOperations;

public class IntegerModOperationsImplTest {
    
    final static int ALLOC_SIZE = 10000;
    final static int MOD_16 = 65521;
    final static int MOD_32 = 0;
    
    IntegerModAllocator mod16alloc;
    IntegerModOperations ops;
    
    @Before
    public void initAlloc(){
        mod16alloc = new IntegerModAllocator(MOD_16);
        ops = new IntegerModOperationsImpl();
    }
    
    @Test
    public void testAddArray(){
        // short test
        ops.initModulo(5);
        int[] a = {0, 2, 3, 4, 4};
        int[] b = {4, 4, 3, 2, 1};
        int[] res = new int[5];
        int[] expected = {4, 1, 1, 1, 0};
        
        try {
            res = ops.add(a, b);
        } catch(ModuloException | OperationException e){
            e.printStackTrace();
        }
        assertArrayEquals("Result differed from expected.", expected, res);
    }
    
    @Test
    public void testAddIntegerMod(){
        //short test
    }
    
    @Test
    public void testDot(){
        // simple test
    }
}
