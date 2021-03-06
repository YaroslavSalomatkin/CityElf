package com.cityelf.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Advertisement is invalid - someone parameter is empty")
public class AdvertisementIncorrectException extends Exception {

}
