package org.seonghun.quicklink.domain.service;

import lombok.RequiredArgsConstructor;
import org.seonghun.quicklink.domain.repository.ShortUrlRepository;
import org.seonghun.quicklink.entity.ShortUrl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ShortLinkRedirectService {
    private final ShortUrlRepository shortUrlRepository;

    public String move(String shortId) {
        return shortUrlRepository.findByShortId(shortId)
                .map(ShortUrl::getUrl)
                .orElseThrow(() -> new IllegalArgumentException("Invalid short URL"));
    }
}
