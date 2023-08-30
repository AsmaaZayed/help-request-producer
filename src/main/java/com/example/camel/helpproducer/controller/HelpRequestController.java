package com.example.camel.helpproducer.controller;

import com.example.camel.helpproducer.dto.HelpRequest;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelpRequestController {
    @Autowired
    private ProducerTemplate producerTemplate;

    @PostMapping("/help-request")
    public void createHelpRequest(@RequestBody HelpRequest helpRequest) {
        producerTemplate.sendBody("direct:sendXmlMessage", helpRequest);
    }
}
