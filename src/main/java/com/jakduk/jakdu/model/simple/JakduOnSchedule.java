package com.jakduk.jakdu.model.simple;

import com.jakduk.jakdu.model.embedded.CommonWriter;
import lombok.Data;

/**
 * @author pyohwan
 * 16. 5. 10 오후 10:57
 */

@Data
public class JakduOnSchedule {

    private String id;

    private CommonWriter writer;

    private Integer homeScore;

    private Integer awayScore;
}
