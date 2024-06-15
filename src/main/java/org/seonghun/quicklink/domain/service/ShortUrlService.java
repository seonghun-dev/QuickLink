package org.seonghun.quicklink.domain.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.validator.routines.UrlValidator;
import org.seonghun.quicklink.entity.ShortUrl;
import org.seonghun.quicklink.domain.repository.ShortUrlRepository;
import org.seonghun.quicklink.utils.Base62Converter;
import org.seonghun.quicklink.utils.SnowFlakeIdGenerator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ShortUrlService {

    private final ShortUrlRepository shortUrlRepository;
    private final UrlValidator urlValidator = new UrlValidator();

    private final SnowFlakeIdGenerator snowFlakeIdGenerator;

    @Transactional
    public String createShortUrl(String url) {
        if (!urlValidator.isValid(url)) {
            throw new IllegalArgumentException("Invalid URL");
        }

        var id = Base62Converter.encode(snowFlakeIdGenerator.generateID());
        var newShortLink = new ShortUrl(id, url, LocalDateTime.now());

        shortUrlRepository.save(newShortLink);

        return id;
    }


}
