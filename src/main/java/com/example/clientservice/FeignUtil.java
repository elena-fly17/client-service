package com.example.clientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// ЭТО ПРЕДЫДУЩИЙ РАБОЧИЙ ВАРИАНТ
//@FeignClient(value = "book-service", url = "http://localhost:8081/api/books",
//        name = "book-service", fallback = Fallback.class)

@FeignClient(value = "book-service", url = "http://localhost:8081/api/books",
        name = "book-service", fallbackFactory = FeignUtilFallbackFactory.class)
public interface FeignUtil {

    @GetMapping
    public List<Book> getAllBooks();
}