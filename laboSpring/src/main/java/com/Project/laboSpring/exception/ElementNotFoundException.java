package com.Project.laboSpring.exception;

public class ElementNotFoundException extends Exception{
    private Object id;

    public ElementNotFoundException(Object id) {
        super("L'element d'id "+id+" en question n'as pas été trouver");

    }
}
