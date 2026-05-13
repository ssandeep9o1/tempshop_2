package org.example.tempshop.exceptions;

public class InvalidCategoryId extends RuntimeException{

    public InvalidCategoryId(String message){
        super(message);
    }
}
