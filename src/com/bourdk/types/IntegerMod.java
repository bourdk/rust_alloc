package com.bourdk.types;

import com.bourdk.exceptions.ModuloException;

public class IntegerMod extends Number implements Comparable<IntegerMod> {
    
    private int value;
    private static int modulo;
    
    private static int modCounter = 0;  // track the number of mod operations performed
    
    public IntegerMod(final int val, final int mod){
        value = setVal(val, mod);
    }
    
    public IntegerMod(final int val){
        value = setVal(val, modulo);
    }
    
    public IntegerMod(){
        value = 0;
    }
    
    private int setVal(final int val, final int mod){
        if(mod > val){
            return val;
        }
        
        modCounter++;  // increment the number of mod operations before performing the mod
        return (val % mod);
    }
    
    
    // add this Integer to argument Integer
    public IntegerMod add(IntegerMod a) throws ModuloException {
        if(this.getMod() != a.getMod()){
            throw new ModuloException("Cannot add 2 integers from different IntegerMod Rings.");
        }
        
        return new IntegerMod(this.intValue() + a.intValue(), modulo);
    }
    
    
    // add 2 given Integers
    public static IntegerMod add(IntegerMod a1, IntegerMod a2) throws ModuloException {
        if(a1.getMod() != a2.getMod()){
            throw new ModuloException("Cannot add 2 integers from different IntegerMod Rings.");
        }
        
        return new IntegerMod(a1.intValue() + a2.intValue(), a1.getMod());
    }
    
    
    // multiply this Integer by argument Integer
    public IntegerMod mul(IntegerMod a) throws ModuloException {
        if(this.getMod() != a.getMod()){
            throw new ModuloException("Cannot multiply 2 integers from different IntegerMod Rings.");
        }
        
        return new IntegerMod(this.intValue() * a.intValue(), modulo);
    }
    
    
    // multiply 2 given Integers
    public static IntegerMod mul(IntegerMod a1, IntegerMod a2) throws ModuloException {
        if(a1.getMod() != a2.getMod()){
            throw new ModuloException("Cannot multiply 2 integers from different IntegerMod Rings.");
        }
        
        return new IntegerMod(a1.intValue() * a2.intValue(), a1.getMod());
    }
    
    
    public String toString(){
        return value + " (mod " + modulo + ")";
    }
    
    public int getMod(){
        return modulo;
    }
    
    public void setMod(final int mod){
        modulo = mod;
    }

    @Override
    public int compareTo(IntegerMod o) {
        return (this.value - o.value) % modulo;
    }

    @Override
    public double doubleValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

}
