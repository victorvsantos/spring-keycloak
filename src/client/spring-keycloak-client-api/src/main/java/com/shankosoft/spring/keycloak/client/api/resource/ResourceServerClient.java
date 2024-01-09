package com.shankosoft.spring.keycloak.client.api.resource;

import com.shankosoft.spring.keycloak.client.api.config.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "resource-server-client",
        url = "${resource.server.endpoint}",
        configuration = OAuthFeignConfig.class
)
public interface ResourceServerClient {

    @GetMapping(value = "/app/v1/resources")
    ResponseEntity<String> getProtectedResources();
}

