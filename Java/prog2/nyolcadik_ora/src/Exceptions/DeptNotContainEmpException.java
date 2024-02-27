package Exceptions;

import Exceptions.CompanyException;

public class DeptNotContainEmpException extends CompanyException {
    public DeptNotContainEmpException(String message) {
        super(message);
    }
}
