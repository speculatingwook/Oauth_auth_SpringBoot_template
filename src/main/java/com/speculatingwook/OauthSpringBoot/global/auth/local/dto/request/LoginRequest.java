package com.speculatingwook.OauthSpringBoot.global.auth.local.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class LoginRequest {
    private String username;
    private String password;
}