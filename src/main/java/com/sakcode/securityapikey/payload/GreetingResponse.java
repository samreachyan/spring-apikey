package com.sakcode.securityapikey.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GreetingResponse {
    private String name;

}
