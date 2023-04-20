package com.develhope.nosqlorm.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;


@Configuration
public class mongodbConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "Cluster0";
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("com.develhope");
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://lucreziarumore98:724013659MongoDB@cluster0.i5jynpz.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).build();
        return MongoClients.create(mongoClientSettings);

    }

}
