package com.bourdk.math;

import java.util.Arrays;

public class Simple2DMatrix<T extends Number> {
	public T[][] matrix;
	
	// multiply 1xN * NxM = 1xM
	public T[] leftMult(T[] vector){
		return null;
	}
	
	// multiply NxM * Mx1 = Nx1
	public T[] rightMult(T[] vector){
		return null;
	}
	
	// matrix multiply NxM * MxP = NxP
	public T[][] multiply(T[][] mtx){
		return null;
	}
	
	// helper dot product method
	private T dot(T[] v1, T[] v2){
		if(v1.length != v2.length){
			return null; // TODO throw exception maybe?
		}
		
		T product;
		Arrays.asList(v1).forEach(action);
		for(T v: v1, T ){
			
		}
	}
}
