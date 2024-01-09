package br.com.shankosoft.spring.keycloak.api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/resources")
public class ResourceController {

    @GetMapping
    public ResponseEntity<String> getResource() {
        return ResponseEntity
                .ok("This is a protected resource. You must have a token generated for the spring-app audience to access it");
    }
}
