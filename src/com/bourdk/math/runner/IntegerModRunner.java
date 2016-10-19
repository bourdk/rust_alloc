package com.bourdk.math.runner;

import java.util.List;

import com.bourdk.alloc.IntegerModAllocator;
import com.bourdk.types.IntegerMod;

public class IntegerModRunner {

    public static void main(String[] args) {
        new IntegerModRunner();
    }
    
    public IntegerModRunner(){
        final int mod = 4;
        
        IntegerModAllocator alloc = new IntegerModAllocator(mod);
        List<IntegerMod> testList = alloc.allocArrayList(500);
        
        System.out.println(testList);
    }

}
