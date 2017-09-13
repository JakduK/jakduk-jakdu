package com.jakduk.jakdu.model.db;

import com.jakduk.jakdu.common.Constants;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author pyohwan
 * 16. 1. 10 오후 11:07
 */

@NoArgsConstructor
@Getter
@Setter
@Document
public class JakduScheduleGroup {

    @Id
    private String id;

    private String seq;

    private Constants.JAKDU_GROUP_STATE state;

    private LocalDateTime openDate;

}
