package com.example.test.payloads;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateUserRequest {
    Map<String,String> names;

    public CreateUserRequest(String name){
        names = new HashMap<>();
        names.put("name",name);
    }
}
