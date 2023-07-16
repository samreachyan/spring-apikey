package com.sakcode.securityapikey.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @GetMapping()
    public ResponseEntity<?> getGreeting() {
        return ResponseEntity.ok("{\"msg\":\"You make http request successfully!!!\"}");
    }

}
