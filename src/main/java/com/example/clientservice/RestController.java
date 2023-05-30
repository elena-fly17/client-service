package com.example.clientservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/client")
public class RestController {

    private static final Logger LOG = LoggerFactory.getLogger(RestController.class);

    @Autowired
    private Environment environment;

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

    @RequestMapping("/test_logging")
    public String home() {
        String home = "Client-Service running at port: "
                + environment.getProperty("local.server.port");
        LOG.info(home);
        return home;
    }
}