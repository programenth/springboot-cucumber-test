package com.example.test.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ContextStorage {

    private final Map<String, Object> storage = new HashMap<>();

    public void put(String key, Object value) {
        storage.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(String key) {
        return (T) storage.get(key);
    }

    public void clear() {
        storage.clear();
    }
}

