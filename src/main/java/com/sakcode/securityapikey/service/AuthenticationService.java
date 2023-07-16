package com.sakcode.securityapikey.service;

import com.sakcode.securityapikey.config.ApiKeyAuthentication;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;

public class AuthenticationService {
    private static final String AUTH_TOKEN_HEADER_NAME = "apiKey";
    private static final String AUTH_TOKEN = "sakcode";

    public static Authentication getAuthentication(HttpServletRequest request) {
        String apiKey = request.getHeader(AUTH_TOKEN_HEADER_NAME);

        if (apiKey == null || !apiKey.equals(AUTH_TOKEN)) {
            throw new BadCredentialsException("Invalid API Key");
        }
        return new ApiKeyAuthentication(AuthorityUtils.NO_AUTHORITIES, apiKey);
    }
}
