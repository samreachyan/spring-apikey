package com.sakcode.securityapikey.rest;

import com.sakcode.securityapikey.payload.DefaultResponse;
import com.sakcode.securityapikey.payload.GreetingRequest;
import com.sakcode.securityapikey.payload.GreetingResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserController {
    @GetMapping()
    public ResponseEntity<?> getGreeting(@RequestBody GreetingRequest request) {
        log.info("request :: {}", request);
        if (request.getName() == null) {
            return ResponseEntity.badRequest()
                    .body(DefaultResponse.builder()
                            .errorCode("1")
                            .msg("Required input name")
                            .build());
        }
        GreetingResponse response = GreetingResponse.builder()
                .name("Welcome to " + request.getName())
                .build();
        return ResponseEntity.ok(DefaultResponse.builder()
                .errorCode("0")
                .msg("success")
                .data(response)
                .build());
    }

}
