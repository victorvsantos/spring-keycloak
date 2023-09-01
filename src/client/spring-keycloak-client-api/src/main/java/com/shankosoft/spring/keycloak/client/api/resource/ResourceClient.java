package com.shankosoft.spring.keycloak.client.api.resource;

import com.shankosoft.spring.keycloak.client.api.config.OAuthFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "resource-api-client",
        url = "${resourceapi.endpoint}",
        configuration = OAuthFeignConfig.class
)
public interface ResourceClient {

    @GetMapping(value = "/resource")
    ResponseEntity<Void> getResourceFromResourceServer();
}

