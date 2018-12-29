package com.daryl.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * message消费者
 */
@Component
@RabbitListener(queues = "Tqueue")
public class Receiver {

    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String message) {
        log.info("Receiver : " + message);
    }


}
