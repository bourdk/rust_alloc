package com.bourdk.math.impl;

import com.bourdk.exceptions.ModuloException;
import com.bourdk.math.IntegerModOperations;
import com.bourdk.types.IntegerMod;

public class IntegerModOperationsImpl implements IntegerModOperations {

    final static int HALF_WORD_PRIME_MOD = 65521; // mod is largest prime that fits in 16 bits
    final static int WORD_PRIME_MOD = 0; // mod is prime and fits in less than Integer.BYTES;
    final static int DOUBLE_WORD_PRIME_MOD = 0; // mod is prime and fits in less than Long.BYTES;
    
    static int modulo;
    
    @Override
    public void initModulo(int m) {
        IntegerModOperationsImpl.modulo = m;
    }

    @Override
    public int[] add(int[] a, int[] b) throws ModuloException {
        if(modulo <= 0){
            throw new ModuloException("Mod must be a positive integer");
        } else if (a.length != b.length){
            throw new ModuloException("Two vector summands must be the same length");
        }
        
        // perform addition based mod size
        if(modulo <= HALF_WORD_PRIME_MOD){
            return addHelper(a, b, 16);
        } else if(modulo > HALF_WORD_PRIME_MOD && modulo <= WORD_PRIME_MOD){
            return addHelper(a, b, 32);
        } else {
            return addHelper(a, b, 64);
        }
    }
    
    // component-wise add a & b, whose elements don't exceed modSize in bits
    private int[] addHelper(int[] a, int[] b, int modSize){
        int numAdds = 0;  // track the number of additions performed in this call
        int[] res = new int[a.length];        
        
        // mod fits in less than 32 bits
        if(modSize < Integer.SIZE) {
            for(int i = 0; i < a.length; i++){
                res[i] = a[i] + b[i];
                // 1 addition will still fit in 32 bits, so no need to take mod
            }
        }
        return res;
    }

    @Override
    public int[] dot(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int[][] mtxAdd(int[][] A, int[][] B) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int[][] mtxMult(int[][] A, int[][] B) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IntegerMod[] add(IntegerMod[] a, IntegerMod[] b) {
        // TODO Auto-generated method stub
        return null;
    }

}
