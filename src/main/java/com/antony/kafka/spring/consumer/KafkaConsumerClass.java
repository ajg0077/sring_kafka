package com.antony.kafka.spring.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerClass {
    @KafkaListener(topics = {"hobbit"}, groupId = "spring-boot-kafka")
    public void consumer(ConsumerRecord<Integer, String> record) {
        System.out.println("received= " + record.value() + " with key " + record.key());
    }

    /*public void consumer(String quote) {
        System.out.println(quote);
    }*/
}
