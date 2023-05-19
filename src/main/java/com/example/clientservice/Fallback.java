package com.example.clientservice;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class Fallback implements FeignUtil{

    @Override
    public List<Book> getAllBooks() {
        return Collections.emptyList();
    }
}