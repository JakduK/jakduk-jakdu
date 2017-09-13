package com.jakduk.jakdu.model.db;

import com.jakduk.jakdu.common.Constants;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author <a href="mailto:phjang1983@daum.net">Jang,Pyohwan</a>
 * @company  : http://jakduk.com
 * @date     : 2014. 9. 28.
 * @desc     :
 */

@Data
@Document
public class FootballClubOrigin {

	@Id
	private String id;
	
	private String name;

	private Constants.CLUB_TYPE clubType;

	private Constants.CLUB_AGE age;

	private Constants.CLUB_SEX sex;

	private String klId; // 프로축구연맹 축구단 ID
}
