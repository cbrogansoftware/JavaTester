package com.csbTester.sandbox;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.stream.Stream;

public class Sandbox2 {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds().stream().filter(x -> x.contains("US")).forEach(System.out::println);

//        Arrays.stream(TimeZone.getAvailableIDs())
//              .filter(x -> x.toString().contains("US"))
//              .forEach(System.out::println);

        String[] usIds = {"US/Eastern", "US/Central", "US/Mountain", "US/Pacific"};
        Arrays.stream(usIds)
                .filter(x -> x.toString().contains("US")) // Not needed here, just poc
                .forEach(x -> System.out.println(x + " " + ZonedDateTime.now(ZoneId.of(x)).format(DateTimeFormatter.ofPattern("HH:mm:ss"))));

//        System.out.println(ZonedDateTime.now(ZoneId.of("US/Eastern")));
//        System.out.println(ZonedDateTime.now(ZoneId.of("US/Central")));



    }
}
