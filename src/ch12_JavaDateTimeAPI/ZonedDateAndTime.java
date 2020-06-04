package ch12_JavaDateTimeAPI;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneOffsetTransitionRule;
import java.time.zone.ZoneRules;
import java.util.List;

public class ZonedDateAndTime {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("America/New_York");
        System.out.println("Zone: " + zone);
        zone = zone.normalized();
        System.out.println("Zone getId: " + zone.getId());
        zone = ZoneId.of("US/Eastern");
        System.out.println("Zone: " + zone);

        zone = ZoneId.of("UTC-5");
        System.out.println("Zone: " + zone);
        zone = zone.normalized();
        System.out.println("Zone normalized: " + zone);

        ZoneOffset USEast = ZoneOffset.of("-5");
        ZoneOffset Nepal = ZoneOffset.ofHoursMinutes(5, 45);

        ZoneId EST = ZoneId.ofOffset("UTC", USEast);
        System.out.println(EST);

        ZoneRules rules = ZoneRules.of(USEast);
        System.out.println("rules " + rules);

        List<ZoneOffsetTransitionRule> listRules = rules.getTransitionRules();
        listRules.stream().forEach((zotr) -> {
            System.out.println("rule: " + zotr);
        });

        System.out.println("Offset: " + USEast);
        System.out.println("Offset: " + Nepal);
//    Set<String> zones = ZoneId.getAvailableZoneIds();
//    zones.stream().forEach((z) -> {
//      System.out.println(z);
//    });

        // Create a ZonedDateTime object
    }
}
