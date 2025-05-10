package aiss.GitMiner.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)  // Esto hace que devuelva un error 400 cuando se lanza
public class BadRequestException extends Exception {

    public BadRequestException(String message) {
        super(message);  // Pasa el mensaje de error a la clase base RuntimeException
    }
}
