package com.inditest.infrastructure.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TimeUtils {

    private TimeUtils(){}

    public static Instant getInstant(String date){
        final DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss");
        return  LocalDateTime.parse(date, df).toInstant(ZoneOffset.UTC);
    }

    public static String getStringDate(Instant date){
        final DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH.mm.ss").withZone(ZoneOffset.UTC);
        return  df.format(date);
    }


}
