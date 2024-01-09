package com.shankosoft.spring.keycloak.client.api.resource;

import com.shankosoft.spring.keycloak.client.api.config.OAuthClientCredentialsFeignManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    private static final Logger logger = LoggerFactory.getLogger(OAuthClientCredentialsFeignManager.class);

    private final ResourceServerClient resourceServerClient;

    @Autowired
    public ResourceController(ResourceServerClient resourceServerClient) {
        this.resourceServerClient = resourceServerClient;
    }

    @GetMapping
    public ResponseEntity<ResourceAPIResult> getProtectedResource() {
        logger.info("Calling protected resources API");
        ResponseEntity<String> response = resourceServerClient.getProtectedResources();
        return ResponseEntity.ok(new ResourceAPIResult(response.getBody()));
    }
}
