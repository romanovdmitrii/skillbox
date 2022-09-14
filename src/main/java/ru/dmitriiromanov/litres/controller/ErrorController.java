package ru.dmitriiromanov.litres.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public String exceptionHandler () {
        log.debug("exceptionHandler");
        return "home";
    }
}
