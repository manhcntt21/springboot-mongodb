package com.example.springmongo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author manhdt14
 * created in 10/2/2023 9:18 AM
 */
@Configuration
public class MongoDBConfig {
    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://root:pass12345@127.0.0.1:27018");
    }
}
