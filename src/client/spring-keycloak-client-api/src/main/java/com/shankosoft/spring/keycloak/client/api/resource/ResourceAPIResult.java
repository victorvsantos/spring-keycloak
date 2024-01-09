package com.shankosoft.spring.keycloak.client.api.resource;

public class ResourceAPIResult {
    String message;

    public ResourceAPIResult(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
