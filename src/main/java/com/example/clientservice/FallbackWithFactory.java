package com.example.clientservice;

import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

@Slf4j
public class FallbackWithFactory implements FeignUtil{

    private String reason;

    public FallbackWithFactory(String reason) {
        this.reason = reason;
    }

    @Override
    public List<Book> getAllBooks() {
        log.info("Failed send request on book service, reason {}", reason);
        return Collections.emptyList();
    }
}
