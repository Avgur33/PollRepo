package ru.javaops.ipoll.error;

public class NotFoundException extends IllegalRequestDataException {
    public NotFoundException(String msg) {
        super(msg);
    }
}