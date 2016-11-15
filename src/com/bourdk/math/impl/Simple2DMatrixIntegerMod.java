package com.bourdk.math.impl;

import com.bourdk.alloc.IntegerModAllocator;

/**
 * Concrete type implementation of a 2D matrix.
 * Uses IntegerMod elements in a 2D array arrangement for data representation.
 * 
 * Implements addition, multiplication.
 * 
 * @author Pavel Bourdykine
 */

import com.bourdk.types.IntegerMod;

public class Simple2DMatrixIntegerMod {
    public IntegerMod[][] mtx;
    public int modulo;  // mod of the Ring elements of this matrix belong to
    
    public Simple2DMatrixIntegerMod(){
        init();
    }
    
    public Simple2DMatrixIntegerMod(final IntegerMod[][] init){
        this.mtx = init;
    }
    
    private IntegerMod[][] init(){
        IntegerModAllocator allocator = new IntegerModAllocator(modulo);
        
        //TODO: init matrix and return
        return null;
    }
    
    
}
