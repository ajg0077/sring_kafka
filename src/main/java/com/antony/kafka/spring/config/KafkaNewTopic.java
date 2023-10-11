package com.antony.kafka.spring.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaNewTopic {

    @Bean
    NewTopic hobbit2() {
        return TopicBuilder
                .name("hobbit2")
                .partitions(12)
                .replicas(3)
                .build();
    }

}
