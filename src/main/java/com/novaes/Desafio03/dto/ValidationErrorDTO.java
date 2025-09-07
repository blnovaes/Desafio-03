/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novaes.Desafio03.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blnov
 */
public class ValidationErrorDTO extends CustomErrorDTO{
    
    private List<FieldMessageDTO> errors = new ArrayList<>();


    public ValidationErrorDTO(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessageDTO> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessageDTO(fieldName, message));
    }    
}
