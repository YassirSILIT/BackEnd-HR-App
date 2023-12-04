package com.api.ensak.HRApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(EmployeeNotFoundException exception){
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("errerMessage",exception.getMessage());
        return errorMap;
    }
}
