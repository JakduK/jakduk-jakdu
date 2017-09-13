package com.jakduk.jakdu.repository.jakdu;

import com.jakduk.jakdu.model.db.JakduScheduleGroup;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author pyohwan
 * 16. 1. 10 오후 10:57
 */
public interface JakduScheduleGroupRepository extends MongoRepository<JakduScheduleGroup, String> {
    JakduScheduleGroup findBySeq(Integer seq);
}
