package com.daryl.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * message生产者
 */
@Component
public class Sender {

    private static final Logger log = LoggerFactory.getLogger(Sender.class);
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "this send's time: " + new Date();
        log.info("Sender : " + context);
        this.amqpTemplate.convertAndSend("Tqueue", context);
    }


}
