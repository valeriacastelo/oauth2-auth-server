package com.example.oauth2authserver.controller;

import com.nimbusds.jose.jwk.JWKSet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
public class JwkSetRestController {

    private final JWKSet jwkSet;

    public JwkSetRestController(JWKSet jwkSet) {
        this.jwkSet = jwkSet;
    }

    @GetMapping("/.well-known/jwks.json")
    public Map<String, Object> keys() {

        log.debug("======== getting the keys");

        return this.jwkSet.toJSONObject();
    }
}
