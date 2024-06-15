package org.seonghun.quicklink.exception.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // Common Client Error Code
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "COMMON_BAD_REQUEST", "Bad Request", "The request could not be understood or was missing required parameters."),
    METHOD_ARGUMENT_NOT_VALID(HttpStatus.BAD_REQUEST, "COMMON_METHOD_ARGUMENT_NOT_VALID", "Method Argument Not Valid", "One or more method arguments are not valid."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "COMMON_UNAUTHORIZED", "Unauthenticated", "Authentication is required and has failed or has not been provided."),
    FORBIDDEN(HttpStatus.FORBIDDEN, "COMMON_FORBIDDEN", "Forbidden", "Access to the requested resource is forbidden."),
    NOT_FOUND(HttpStatus.NOT_FOUND, "COMMON_NOT_FOUND", "Not Found", "The requested resource could not be found."),
    METHOD_NOT_ALLOWED(HttpStatus.METHOD_NOT_ALLOWED, "COMMON_METHOD_NOT_ALLOWED", "Method Not Allowed", "The method received in the request-line is known by the origin server but not supported."),
    CONFLICT(HttpStatus.CONFLICT, "COMMON_CONFLICT", "Conflict", "The request could not be completed due to a conflict with the current state of the target resource."),

    // Common Server Error Code
    INTERNAL_SEVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON_INTERNAL_SEVER_ERROR", "Internal Server Error", "Internal Server Error"),

    // Short URL Error Code
    NOT_FOUND_SHORT_URL(HttpStatus.NOT_FOUND, "SHORT_URL_NOTFOUND", "Short URL Not Found", "Can Not Found Short URL"),
    INVALID_URL(HttpStatus.BAD_REQUEST, "SHORT_URL_INVALID_URL", "Invalid URL", "This URL is invalid");

    private final HttpStatus status;
    private final String code;
    private final String title;
    private final String message;
}
