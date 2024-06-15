package org.seonghun.quicklink.exception.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Getter
@Builder
public class ErrorResponseDto {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private final int status;
    private final String code;
    private final String title;
    private final String message;

    public static ResponseEntity<ErrorResponseDto> toResponseEntity(ErrorCode errorCode) {
        return ResponseEntity
                .status(errorCode.getStatus())
                .body(ErrorResponseDto.builder()
                        .status(errorCode.getStatus().value())
                        .code(errorCode.getCode())
                        .title(errorCode.getTitle())
                        .message(errorCode.getMessage())
                        .build());
    }
}