package com.jakduk.jakdu.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pyohwanjang on 2017. 5. 1..
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties("jakduk")
public class JakdukProperties {

    private Mongodb mongodb = new Mongodb();
    private Swagger swagger = new Swagger();

    @Getter
    @Setter
    @Configuration
    @ConfigurationProperties("jakduk.mongodb")
    public class Mongodb {
        private String database;
        private String host;
    }

    @Getter
    @Setter
    @Configuration
    @ConfigurationProperties("jakduk.swagger")
    public class Swagger {
        private String protocol;
        private String host;
    }

}
