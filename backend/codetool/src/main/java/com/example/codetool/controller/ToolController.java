package com.example.codetool.controller;
import com.example.codetool.model.CodeRequest;
import com.example.codetool.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class ToolController {

    @Autowired
    private CodeService codeService;

    // Endpoint for code formatting
    @PostMapping("/format")
    public String formatCode(@RequestBody CodeRequest request) {
        return codeService.formatCode(request);
    }

    // Endpoint for code validation
    @PostMapping("/validate")
    public String validateCode(@RequestBody CodeRequest request) {
        return codeService.validateCode(request);
    }

    // Endpoint for data conversion
    @PostMapping("/convert")
    public String convertCode(@RequestBody CodeRequest request) {
        return codeService.convertCode(request);
    }

    // Endpoint for data visualization
    @PostMapping("/visualize")
    public String visualizeCode(@RequestBody CodeRequest request) {
        return codeService.visualizeCode(request);
    }

    // Endpoint for handling file uploads
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {
        // Implement file handling logic here
        // Example: Saving file to server or processing it
        String fileName = file.getOriginalFilename();
        // Replace with your actual file processing logic
        return "File '" + fileName + "' uploaded successfully";
    }

    // Example GET endpoint
    @GetMapping("/example")
    public String exampleGetMethod() {
        return "This endpoint supports GET requests.";
    }
}
