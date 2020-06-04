package ch12_JavaDateTimeAPI;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ISO_ORDINAL_DATE;
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy G, hh:mm a 'Q'q VV");
        System.out.println(now.format(formatter));
        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(now.format(formatter));
    }
}
