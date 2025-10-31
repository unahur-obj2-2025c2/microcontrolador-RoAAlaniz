package ar.unahur.edu.obj2.patroncommand.excepciones;

public class IllegalArgumentException extends RuntimeException{
    public IllegalArgumentException(String message) {
        super(message);
    }
}