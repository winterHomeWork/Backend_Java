package com.anys34.homework.domain.user.service;

import com.anys34.homework.global.config.properties.AuthProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KakaoAuthLinkService {

    private static final String QUERY_STRING = "?client_id=%s&" +
            "redirect_uri=%s&response_type=code";
    private final AuthProperties authProperties;

    public String execute() {
        return authProperties.getKakaoBaseUrl() +
                String.format(
                        QUERY_STRING,
                        authProperties.getKakaoJavascriptId(),
                        authProperties.getKakaoRedirectUrl()
                );
    }
}
