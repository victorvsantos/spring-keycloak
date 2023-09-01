package br.com.shankosoft.spring.keycloak.api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

    @GetMapping
    public ResponseEntity<Void> getResource() {
        return ResponseEntity.ok().build();
    }
}
