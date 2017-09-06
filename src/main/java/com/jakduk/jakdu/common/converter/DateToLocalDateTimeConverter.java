package com.jakduk.jakdu.common.converter;

import com.jakduk.jakdu.common.util.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by pyohwanjang on 2017. 3. 12..
 */
public class DateToLocalDateTimeConverter implements Converter<Date, LocalDateTime> {

    @Override
    public LocalDateTime convert(Date source) {
        return DateUtils.dateToLocalDateTime(source);
    }

}
