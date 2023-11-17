package Exceptions;

import Exceptions.CompanyException;

public class WrongBirthDateException extends CompanyException {
    public WrongBirthDateException(String message) {
        super(message);
    }
}
