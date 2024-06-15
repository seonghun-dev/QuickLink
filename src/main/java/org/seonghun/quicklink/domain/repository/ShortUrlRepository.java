package org.seonghun.quicklink.domain.repository;

import org.seonghun.quicklink.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {
    Optional<ShortUrl> findByShortId(String shortId);
}
