/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.novaes.Desafio03.services.exceptions;

/**
 *
 * @author blnov
 */
@SuppressWarnings("serial")
public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}
