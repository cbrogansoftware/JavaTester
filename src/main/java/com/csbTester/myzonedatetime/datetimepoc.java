package com.csbTester.myzonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class datetimepoc {
    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds()
                .stream().filter(x -> x.contains("US"))
                .forEach(System.out::println);

        String[] usIds = {"US/Eastern", "US/Central", "US/Mountain", "US/Pacific"};
        Arrays.stream(usIds)
                .filter(x -> x.toString().contains("US")) // Not needed here, just poc
                .forEach(x -> System.out.println(x + " "
                        + ZonedDateTime.now(ZoneId.of(x))
                        .format(DateTimeFormatter.ofPattern("HH:mm:ss"))));

//        System.out.println(ZonedDateTime.now(ZoneId.of("US/Eastern")));



    }
}
