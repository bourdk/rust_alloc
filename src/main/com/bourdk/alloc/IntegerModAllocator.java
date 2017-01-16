package com.bourdk.alloc;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;

import com.bourdk.types.IntegerMod;

public class IntegerModAllocator extends GenericCollectionAllocator<IntegerMod> {
    
    private static int modulo;
    
    public IntegerModAllocator(final int mod){
        modulo = mod;
    }
    
    public List<IntegerMod> allocArrayList(final int size){
        List<IntegerMod> ret = new ArrayList<IntegerMod>(size);
        for(int i = 0; i < size; i++){
            ret.add(new IntegerMod(randomVal(), modulo));
        }
        return ret;
    }
    
    public List<IntegerMod> allocVectorList(final int size){
        List<IntegerMod> ret = new Vector<IntegerMod>(size);
        for(int i = 0; i < size; i++){
            ret.add(new IntegerMod(randomVal(), modulo));
        }
        return ret;
    }
    
    public IntegerMod[] allocArray(final int size){
        IntegerMod[] ret = new IntegerMod[size];
        for(int i = 0; i < size; i++){
            ret[i] = new IntegerMod(randomVal(), modulo);
        }
        return ret;
    }
    
    // return a random value in this Ring, hopefully final will inline it
    final static int randomVal(){
        return ThreadLocalRandom.current().nextInt(0, modulo);
    }
}
