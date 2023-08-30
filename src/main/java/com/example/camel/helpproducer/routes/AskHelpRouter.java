package com.example.camel.helpproducer.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class AskHelpRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:sendXmlMessage")
                .marshal().jacksonXml()
                .log("${body}")
                .to("activemq:my-activemq-queue");
    }
}

