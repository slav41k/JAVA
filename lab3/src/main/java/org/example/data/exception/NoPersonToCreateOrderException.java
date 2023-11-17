package org.example.data.exception;

public class NoPersonToCreateOrderException extends Exception{
    public NoPersonToCreateOrderException(String errorMessage){
        super(errorMessage);
    }
}
