package com.bourdk.math.runner;

import java.util.List;

import com.bourdk.alloc.IntegerModAllocator;
import com.bourdk.types.IntegerMod;

/**
 * Allocate some integers mod prime, run some operations
 * 
 * Use IntegerModAllocator to allocate
 * Use IntegerModOperations to perform operations
 *
 * @author Pavel Bourdykine
 *
 */
public class IntegerModRunner {
    
    public static void main(String[] args) {
        new IntegerModRunner();
    }
    
    public IntegerModRunner(){
        final int mod = 65521;  // largest prime that fits in 16 bits
        
        IntegerModAllocator alloc = new IntegerModAllocator(mod);
        List<IntegerMod> l1 = alloc.allocArrayList(50);
        IntegerMod[] a1 = alloc.allocArray(50);
        
        l1.forEach(System.out::println);
        
        
    }

}
