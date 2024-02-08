package com.anys34.homework.infra.feign.client;

import com.anys34.homework.domain.user.presentation.dto.KakaoInfo;
import com.anys34.homework.infra.feign.client.dto.KaKaoToken;
import com.anys34.homework.infra.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "KaKaoClient", url = "https://kauth.kakao.com", configuration = FeignConfig.class)
public interface KaKaoClient {
    @PostMapping(value = "/v2/user/me", produces = "application/json")
    KakaoInfo getInfo(@RequestHeader("Authorization") String accessToken);
}