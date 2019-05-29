package com.zjy.kafkalearning.kafkalearning.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jason Zhang
 * @Date: 2019/5/29 11:07 AM
 * @Version: 1.0
 * @Des：
 */
@RestController
@RequestMapping(value = "/kafka")
@Api("KafkaServcie")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/produce")
    public String produce(String msg){
        if(msg.isEmpty()){
            msg ="null msg";
        }
        kafkaTemplate.send("testkafka",msg);

        return "success";
    }
    
}
