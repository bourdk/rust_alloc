package com.bourdk.math;

import com.bourdk.exceptions.ModuloException;
import com.bourdk.exceptions.OperationException;
import com.bourdk.types.IntegerMod;

/**
 * Operations that can be performed on structures containing Integers % modulo
 * E.g., dot product, matrix add, matrix mult, etc...
 * 
 * for general use, call initModulo method first to initialize the mod number
 *
 * @author Pavel Bourdykine
 *
 */

public interface IntegerModOperations {

    /**
     * Initialize mod, otherwise use initial value of 0
     * @param m
     */
    void initModulo(final int m);
    
    /**
     * Add two vectors 
     * @param a
     * @param b
     * @return a + b
     * @throws ModuloException 
     */
    int [] add(final int [] a, final int [] b) throws ModuloException, OperationException;
    
    /**
     * Dot product of two vectors
     * @param a
     * @param b
     * @return a dot b
     */
    int dot(final int [] a, final int [] b) throws ModuloException, OperationException;
    
    /**
     * Add two matrices represented by 2D int arrays A & B
     * @param A
     * @param B
     * @return A + B as a 2D int array
     */
    int [][] mtxAdd(final int [][] A, final int [][] B);
    
    /**
     * Multiply two matrices represented by 2D int arrays A & B
     * @param A
     * @param B
     * @return A * B
     */
    int [][] mtxMult(final int [][] A, final int [][] B);
    
    IntegerMod[] add(final IntegerMod[] a, final IntegerMod[] b) throws ModuloException, OperationException;
    
    IntegerMod[] dot(final IntegerMod[] a, final IntegerMod[] b) throws ModuloException, OperationException;
}
