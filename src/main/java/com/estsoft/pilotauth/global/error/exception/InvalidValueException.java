package com.estsoft.pilotauth.domain.global.error.exception;

public class InvalidValueException extends BusinessException{

    public InvalidValueException(ErrorCode errorCode) {
        super(errorCode);
    }

}