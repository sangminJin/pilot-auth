package com.estsoft.pilotauth.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer    // OAuth2 권한 서버
public class Oauth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("clientId") // 클라이언트 아이디
                .secret("{noop}clientSecret") // 클라이언트 시크릿
                .redirectUris("http://localhost:8081/oauth2/callback")
                .authorizedGrantTypes("authorization_code")
                .scopes("read", "write")    // 해당 클라이언트의 접근 범위
                .accessTokenValiditySeconds(60 * 60 * 4)            // access token 유효 기간 (초 단위)
                .refreshTokenValiditySeconds(60 * 60 * 24 * 120);   // refresh token 유효 기간 (초 단위)
    }
}