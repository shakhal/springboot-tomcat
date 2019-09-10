package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(path = "/return422")
    public ResponseEntity<Void> return422() {
        return ResponseEntity.unprocessableEntity().build();
    }

    @GetMapping(path = "/return404")
    public ResponseEntity<Void> return404() {
        return ResponseEntity.notFound().build();
    }

    @GetMapping(path = "/return400")
    public ResponseEntity return400() {
        return ResponseEntity.badRequest().build();
    }
}
