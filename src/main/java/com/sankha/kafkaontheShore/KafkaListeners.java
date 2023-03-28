package com.sankha.kafkaontheShore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(topics = "Sankha",
    groupId = "nemo")
    void listener(String data){
        System.out.println("Listerner Received Data: "+data+" ");
    }
}
