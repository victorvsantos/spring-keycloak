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
@RequestMapping("/api/v1")
public class ResourceController {

    private static final Logger logger = LoggerFactory.getLogger(OAuthClientCredentialsFeignManager.class);

    private final ResourceClient resourceClient;

    @Autowired
    public ResourceController(ResourceClient resourceClient) {
        this.resourceClient = resourceClient;
    }

    @GetMapping("/resource")
    public ResponseEntity<Void> getProtectedResource() {
        try {
            resourceClient.getResourceFromResourceServer();
        } catch (Exception ex) {
            logger.error("There was a problem {}", ex);
            return ResponseEntity.internalServerError().build();
        }
        return ResponseEntity.ok().build();
    }
}
