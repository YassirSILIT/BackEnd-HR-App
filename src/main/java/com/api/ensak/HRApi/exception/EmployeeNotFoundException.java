package com.api.ensak.HRApi.exception;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(Long id){
        super("Could not found the user with id " + id);
    }
}
