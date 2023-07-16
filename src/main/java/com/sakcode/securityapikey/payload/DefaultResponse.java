package com.sakcode.securityapikey.payload;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultResponse<T> {
    private String errorCode;
    private String msg;
    private T data;

}
