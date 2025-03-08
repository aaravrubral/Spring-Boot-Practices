package com.example.SpringSecurity.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @GetMapping("/product")
    public ResponseEntity<String> product(){
        return new ResponseEntity<>("Logged-In Successfully", HttpStatus.CREATED);
    }
}
