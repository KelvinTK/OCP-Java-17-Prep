import java.time.*;

public class DateNtime {
    public static void main(String[] args){
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

        LocalTime now2 = LocalTime.now();
        System.out.println(now2);

        LocalDateTime now3 = LocalDateTime.now();
        System.out.println(now3);

        ZonedDateTime now4 = ZonedDateTime.now();
        System.out.println(now4);

        //Create date
        LocalDate d1 = LocalDate.of(2024, 1, 27);
        LocalDate d2 = LocalDate.of(2024, Month.JANUARY, 27);
        System.out.println();
        System.out.println(d1);
        System.out.println(d2);

        //create time
        LocalTime t1 = LocalTime.of(11, 24);
        LocalTime t2 = LocalTime.of(11, 24, 56, 156);
        System.out.println();
        System.out.println(t1);
        System.out.println(t2);

        //create local DateTime
        LocalDateTime dt1 = LocalDateTime.of(2024, 1, 27, 11, 26);
        LocalDateTime dt2 = LocalDateTime.of(d1, t1);
        System.out.println();
        System.out.println(dt1);
        System.out.println(dt2);

        //create Zoned DateTime
        ZoneId zone = ZoneId.of("Africa/Harare");
        ZonedDateTime zdt1 = ZonedDateTime.of(d1, t1, zone);
        System.out.println();
        System.out.println(zdt1);

        //for GMT - subtract the offset from the zoned time

    }
}
