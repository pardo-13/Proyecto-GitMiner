package aiss.GitMiner.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Issue not found")
public class NotFoundExceptionIssue extends Exception {
}
