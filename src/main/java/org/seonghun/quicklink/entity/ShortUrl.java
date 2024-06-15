package org.seonghun.quicklink.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PROTECTED;

@Getter
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
@Table(indexes = {
        @Index(name = "idx__url", columnList = "url"),
})
@Entity
public class ShortUrl {

    @Id
    private String shortId;

    @Column(nullable = false)
    private String url;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

}