package com.Lab1.lab1.service;

import com.Lab1.lab1.dto.ReverseRequest;
import org.springframework.stereotype.Service;

@Service
public class StringService {
    public String reverseString(ReverseRequest reverseRequest){
        String toReverse = reverseRequest.getString();
        String reversedString = new StringBuilder(toReverse).reverse().toString();
        return reversedString;
    }
}
