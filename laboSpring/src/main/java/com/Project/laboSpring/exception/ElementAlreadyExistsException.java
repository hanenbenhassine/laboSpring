package com.Project.laboSpring.exception;

public class ElementAlreadyExistsException extends Exception{
    public ElementAlreadyExistsException() {
        super("L'element existe déjà dans la DB");
    }
}
