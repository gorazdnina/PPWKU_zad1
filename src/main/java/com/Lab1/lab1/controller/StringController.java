package com.Lab1.lab1.controller;

import com.Lab1.lab1.dto.ReverseRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/request")
    public ResponseEntity<String> getController(@RequestBody ReverseRequest reverseRequest) {
        String toReverse = reverseRequest.getString();
        String reversedString = new StringBuilder(toReverse).reverse().toString();
        return ResponseEntity.ok(reversedString);
    }
}
