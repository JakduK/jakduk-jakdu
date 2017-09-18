package com.jakduk.jakdu.jakdu;

import com.jakduk.jakdu.configuration.JakdukProperties;
import com.jakduk.jakdu.configuration.MongodbConfig;
import com.jakduk.jakdu.model.db.JakduSchedule;
import com.jakduk.jakdu.model.embedded.JakduScheduleScore;
import com.jakduk.jakdu.repository.jakdu.JakduScheduleRepository;
import org.bson.types.ObjectId;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@DataMongoTest
@Import({JakdukProperties.class, MongodbConfig.class})
public class JakduScheduleRepositoryTests {

    @Autowired
    private JakduScheduleRepository repository;

    private JakduSchedule jakduSchedule;

    @Before
    public void setUp(){
        jakduSchedule = JakduSchedule.builder()
                .id(new ObjectId().toString())
                .date(LocalDateTime.now())
                .score(
                        JakduScheduleScore.builder()
                        .homeFullTime(1)
                        .awayFullTime(0)
                        .build()
                )
                .timeUp(true)
                .build();

        repository.save(jakduSchedule);
    }

    @Test
    public void findAllTest() {
        System.out.println(repository.findOne(jakduSchedule.getId()));
    }

    @After
    public void after() {
        repository.delete(jakduSchedule.getId());
    }

}
