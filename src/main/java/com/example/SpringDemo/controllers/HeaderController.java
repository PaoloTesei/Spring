package com.example.SpringDemo.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController public class HeaderController {

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader HttpHeaders headers){
        String hostName = headers.getHost().getHostName();
        int hostPort = headers.getHost().getPort();

        return "HostName: " + hostName + "\nHostPort: " + hostPort;
    }

}
