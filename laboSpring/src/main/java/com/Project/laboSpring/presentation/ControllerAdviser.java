package com.Project.laboSpring.presentation;

import com.Project.laboSpring.rapprt.Rapport;
import com.Project.laboSpring.rapprt.RapportValidation;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdviser extends ResponseEntityExceptionHandler {
    //public ResponseEntity<Rapport>handleInvalidP

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        RapportValidation rapportValidation=new RapportValidation("Erreur de validation ",HttpStatus.BAD_REQUEST.value(), request.getDescription(false));
        for(ObjectError globalError: ex.getBindingResult().getGlobalErrors()){
            rapportValidation.addError(true,globalError.getDefaultMessage());
        }
        for (FieldError fieldError:ex.getBindingResult().getFieldErrors()
             ) {
            rapportValidation.addError(false,fieldError.getField()+"-"+fieldError.getDefaultMessage());

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(rapportValidation);
    }
}
