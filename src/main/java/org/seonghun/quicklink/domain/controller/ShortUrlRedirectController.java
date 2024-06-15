package org.seonghun.quicklink.domain.controller;

import lombok.RequiredArgsConstructor;
import org.seonghun.quicklink.domain.service.ShortLinkRedirectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/r")
@RequiredArgsConstructor
public class ShortUrlRedirectController {
    private final ShortLinkRedirectService shortLinkRedirectService;

    @GetMapping("{shortId}")
    public String redirectUrl(
            @PathVariable("shortId") String shortId
    ) {
        var response = shortLinkRedirectService.move(shortId);
        return "redirect:" + response;
    }

}
