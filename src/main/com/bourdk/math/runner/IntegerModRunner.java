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
    
    final static int ALLOC_SIZE = 10000;
    
    public static void main(String[] args) {
        new IntegerModRunner();
    }
    
    public IntegerModRunner(){
        final int mod = 65521;  // largest prime that fits in 16 bits
        
        IntegerModAllocator alloc = new IntegerModAllocator(mod);
        List<IntegerMod> l1 = alloc.allocArrayList(ALLOC_SIZE);
        IntegerMod[] a1 = alloc.allocArray(ALLOC_SIZE);
        
        System.out.println(1);
        
        System.gc();
        
        System.out.println(2);
        
        extraAlloc(alloc);
        
        System.out.println(3);
        
//        Console c = System.console();
//        String in = c.readLine();
//        System.exit(Integer.valueOf(in));
    }

    private void extraAlloc(IntegerModAllocator al){
        List<IntegerMod> l2 = al.allocArrayList(ALLOC_SIZE);
    }
}
