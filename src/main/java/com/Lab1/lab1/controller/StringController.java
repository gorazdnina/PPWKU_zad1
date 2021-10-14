package com.Lab1.lab1.controller;

import com.Lab1.lab1.dto.ReverseRequest;
import com.Lab1.lab1.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @Autowired
    private StringService stringService;
    @GetMapping("/request")
    public ResponseEntity<String> getController(@RequestBody ReverseRequest reverseRequest) {

        return ResponseEntity.ok(stringService.reverseString(reverseRequest));
    }
}
