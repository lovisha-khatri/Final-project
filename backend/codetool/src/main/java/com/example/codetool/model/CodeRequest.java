package com.example.codetool.model;

public class CodeRequest {
    // Define fields as per your requirements
    private String code;
    private String type; // For example, 'html', 'css', 'json', 'xml', etc.
    
    // Getters and setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
