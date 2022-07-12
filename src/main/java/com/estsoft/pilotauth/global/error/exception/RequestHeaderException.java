package com.estsoft.pilotauth.domain.global.error.exception;

public class RequestHeaderException extends BusinessException {

    public RequestHeaderException(ErrorCode errorCode) {
        super(errorCode);
    }

}
