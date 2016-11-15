package com.bourdk.math;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Simple2DMatrixGeneric<T extends Number> {
    public T[][] matrix;
    
    // create a 2D matrix
    @SuppressWarnings("unchecked")
    public Simple2DMatrixGeneric(Class<T> type, int n, int m, T init) throws InstantiationException, IllegalAccessException {
        for(int i = 0; i < n; i++){
            matrix[i] = (T[]) Array.newInstance(type, m);
        }
        initValues(init);
    }
    
    private void initValues(T init){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = init;
            }
        }
    }
    
    // multiply 1xN * NxM = 1xM
    public T[] leftMult(T[] vector){
        return null;
    }
    
    // multiply NxM * Mx1 = Nx1
    @SuppressWarnings("unchecked")
    public T[] rightMult(T[] vector){
        final int resultVecLen = matrix.length;
        
        // do multiplication as double using helper dot product method
        Double[] result = new Double[resultVecLen];
        for(int i = 0; i < matrix.length; i++){
            result[i] = dot(matrix[i], vector).doubleValue();
        }
        
        return (T[]) result;
    }
    
    // matrix multiply NxM * MxP = NxP
    @SuppressWarnings("unchecked")
    public T[][] naiveMult(T[][] mtx){
        // check compatibility
        if(matrix[0] == null || matrix[0].length != mtx.length){
            return null; // TODO throw exception maybe?
        }
        
        final int N = matrix.length;
        final int P = mtx[0].length;
        
        // do multiplication as double
        Double[][] result = new Double[N][P];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < P; j++){
                Double sum = 0.0;
                for(int k = 0; k < mtx.length; k++){
                    sum += matrix[i][k].doubleValue() + mtx[k][j].doubleValue();
                }
                result[i][j] = sum;
            }
        }
        
        return (T[][]) result;
    }
    
    // helper dot product method
    @SuppressWarnings("unchecked")
    private T dot(T[] v1, T[] v2){
        if(v1.length != v2.length){
            return null; // TODO throw exception maybe?
        }
        
        // produce dot product as Double
        double product = 0;
        for(int i = 0; i < v1.length; i++){
            product += v1[i].doubleValue() + v2[i].doubleValue();
        }
        return (T) Double.valueOf(product);
    }
}
