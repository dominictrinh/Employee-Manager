package tech.getarrays.employeemanager.exception;

public class UserNotFoundException extends RuntimeException {
    // calls super class constructor
    public UserNotFoundException(String message) {
        super(message);
    }
}
