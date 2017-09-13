package com.jakduk.jakdu.model.db;

import com.jakduk.jakdu.model.embedded.JakduScheduleScore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author pyohwan
 * 15. 12. 23 오후 11:07
 */

@Data
@Document
public class JakduSchedule {

    @Id
    private String id;

    @DBRef
    private JakduScheduleGroup group;

    private LocalDateTime date;

    @DBRef
    private FootballClubOrigin home;

    @DBRef
    private FootballClubOrigin away;

    @DBRef
    private Competition competition;

    private JakduScheduleScore score;

    private Boolean timeUp;

    private Integer matchId; // 경기 번호

    private Integer roundId; // 라운드 번호

}
