package com.bourdk.exceptions;

public class ModuloException extends Exception{
    public ModuloException(String msg){
        super(msg);
    }
    
    public ModuloException(Throwable t){
        super(t);
    }
    
    public ModuloException(String s, Throwable t){
        super(s, t);
    }
}
