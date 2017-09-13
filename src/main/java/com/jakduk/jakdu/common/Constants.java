package com.jakduk.jakdu.common;
/**
 * @author <a href="mailto:phjang1983@daum.net">Jang,Pyohwan</a>
 * @company  : http://jakduk.com
 * @date     : 2014. 4. 29.
 * @desc     :
 */
public class Constants {

	public final static String SEQ_JAKDU_SCHEDULE_GROUP = "JAKDU_SCHEDULE_GROUP";

	// 이름 타입.
	public enum NAME_TYPE {
		fullName,
		shortName
	}

	// 축구단 성격.
	public enum CLUB_TYPE {
		FOOTBALL_CLUB,
		NATIONAL_TEAM
	}

	// 축구단 연령대.
	public enum CLUB_AGE {
		UNDER_14,
		UNDER_17,
		UNDER_20,
		UNDER_23,
		SENIOR
	}

	// 축구단 성별.
	public enum CLUB_SEX {
		MEN,
		WOMEN
	}

	// 작두 경기의 상태.
	public enum JAKDU_GROUP_STATE {
		SCHEDULE,	// 경기 예정
		STANDBY,	// 대기중
		PLAYING,	// 진행중
		TIMEUP		// 경기 종료
	}

	// 이미지 타입
	public enum IMAGE_TYPE {
		FULL,		// 전체크기
		THUMBNAIL	// 썸네일
	}

	public enum IMAGE_SIZE_TYPE {
		LARGE,
		SMALL
	}

	/**
	 * 몽고DB Criteria Operator
	 */
	public enum CRITERIA_OPERATOR {
		GT,
		LT
	}

}
