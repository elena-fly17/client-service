package com.example.clientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/client")
public class RestController {

    @Autowired
    private FeignUtil feignUtil;

    @GetMapping
    public List<Book> getAllBooks() {
        return feignUtil.getAllBooks();
    }

    @GetMapping("/test")
    public String getTestStringLoadBalancer() {
        return "Test string from client-service";
    }
}