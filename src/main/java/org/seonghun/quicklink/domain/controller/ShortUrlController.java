package org.seonghun.quicklink.domain.controller;

import lombok.RequiredArgsConstructor;
import org.seonghun.quicklink.domain.dto.request.ShortUrlCreateRequestDto;
import org.seonghun.quicklink.domain.service.ShortUrlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
@RequiredArgsConstructor
public class ShortUrlController {

    private final ShortUrlService shortUrlService;

    @PostMapping
    public ResponseEntity<?> createShortUrl(
            @RequestBody ShortUrlCreateRequestDto shortUrlCreateDto
    ) {
        var response = shortUrlService.createShortUrl(shortUrlCreateDto.url());
        return ResponseEntity.ok(response);
    }

}
