package com.jakduk.jakdu.jakdu;

import com.jakduk.jakdu.configuration.JakdukProperties;
import com.jakduk.jakdu.configuration.MongodbConfig;
import com.jakduk.jakdu.repository.jakdu.JakduRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest
@Import({JakdukProperties.class, MongodbConfig.class})
public class JakduRepositryTests {

    @Autowired
    private JakduRepository repository;

    @Test
    public void findAllTest() {
        System.out.println(repository.findAll());
    }
}
