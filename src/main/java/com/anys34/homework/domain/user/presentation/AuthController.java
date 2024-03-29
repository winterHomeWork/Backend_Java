package com.anys34.homework.domain.user.presentation;

import com.anys34.homework.domain.user.presentation.dto.AccessTokenResponse;
import com.anys34.homework.domain.user.presentation.dto.RefreshTokenRequest;
import com.anys34.homework.domain.user.service.CreateAccessTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/auth")
@RestController
public class AuthController {
    private final CreateAccessTokenService createNewAccessToken;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AccessTokenResponse createNewAccessToken(@RequestBody RefreshTokenRequest request) {
        return createNewAccessToken.execute(request);
    }
}
