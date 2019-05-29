package com.zjy.kafkalearning.kafkalearning.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Jason Zhang
 * @Date: 2019/5/29 11:28 AM
 * @Version: 1.0
 * @Des：
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "testkafka")
    public void listen (ConsumerRecord<?, ?> record) throws Exception {
        System.out.println("new msg");
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }

}
