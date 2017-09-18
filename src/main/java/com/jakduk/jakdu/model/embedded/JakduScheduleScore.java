package com.jakduk.jakdu.model.embedded;

import lombok.*;

/**
 * @author pyohwan
 * 15. 12. 25 오후 11:08
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class JakduScheduleScore {

    private Integer homeFullTime; // 정규시간 종료 홈 스코어

    private Integer awayFullTime; // 정규시간 종료 어웨이 스코어

    private Integer homeOverTime; // 연장전 종료 홈 스코어

    private Integer awayOverTime; // 연장전 종료 어웨이 스코어

    private Integer homePenaltyShootout; // 승부차기 종료 홈 스코어

    private Integer awayPenaltyShootout; // 승부차기 종료 어웨이 스코어

}
