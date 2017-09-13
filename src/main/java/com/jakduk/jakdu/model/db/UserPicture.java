package com.jakduk.jakdu.model.db;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by pyohwan on 17. 2. 16.
 */

@Document
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPicture {

    @Id
    private String id;

    @DBRef
    @Setter
    private User user;

    @Setter private String status;

    private String contentType;

    private String sourceType;

}
