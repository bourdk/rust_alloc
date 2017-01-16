package com.bourdk.exceptions;

public class OperationException extends Exception{
    public OperationException(String msg){
        super(msg);
    }
    
    public OperationException(Throwable t){
        super(t);
    }
    
    public OperationException(String s, Throwable t){
        super(s, t);
    }
}