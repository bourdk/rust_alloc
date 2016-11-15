package com.bourdk.math.runner;

import com.bourdk.math.Simple2DMatrixGeneric;

public class MatrixMultiplyRunner {

    public static void main(String[] args) {
        new MatrixMultiplyRunner();   
    }
    
    public MatrixMultiplyRunner(){
        Simple2DMatrixGeneric<Double> mtx1 = (Simple2DMatrixGeneric<Double>) this.<Double>initMatrix(2, 2);
        Simple2DMatrixGeneric<Double> mtx2;
    }
    
    // generic matrix initializer
    private <T> Simple2DMatrixGeneric<?> initMatrix(int dim1, int dim2){
        
        
        return null;
        
    }
    
    // generic n-dim matrix initializer
    private <T> Simple2DMatrixGeneric<?> initMatrix(int dim1, int ... dimn){
        // n-dimensional array
        for(int i = 0; i < dimn.length; i ++){
            
        }
        
        return null;
        
    }
}
