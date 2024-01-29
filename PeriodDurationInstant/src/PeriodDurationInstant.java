import java.time.*;
import java.time.temporal.*;

public class PeriodDurationInstant {
    public static void main(String[] args){
        //Period: can only be used with localDate and LocalDatTime
        Period p1 = Period.ofYears(3);
        Period p2 = Period.of(3, 4, 1);
        System.out.println(p1);
        System.out.println(p2);

        //can be used with plus/minus
        LocalDate d = LocalDate.of(2024, 6, 23);
        System.out.println();
        System.out.println(d);
        d = d.plus(p2);
        System.out.println(d);


        //Duration: can only be used with LocalTime and LocalDateTime
        Duration d1 = Duration.ofDays(5);
        System.out.println();
        System.out.println(d1);

        //using chronounits
        Duration d0 = Duration.of(3, ChronoUnit.HALF_DAYS);//etc
        System.out.println();
        System.out.println(d0);

        //ChronoUnits can also be used to tell how far apart time is
        LocalTime t1 = LocalTime.of(23, 45);
        LocalTime t2 = LocalTime.of(10, 30);
        System.out.println();
        System.out.println(ChronoUnit.HOURS.between(t1, t2)); //etc

        //Duration can be used with plus/minus on time
        System.out.println();
        System.out.println(t1);
        System.out.println(d0);
        t1 = t1.plus(d0);
        System.out.println(t1);

        //Instants: are used to record timeStamps in the application
        Instant now  = Instant.now();
        System.out.println();
        System.out.println(now);

        //measure duration of a process
        System.out.println();
        Instant before = Instant.now();
        System.out.println("Hello"); //some process
        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);
        System.out.println(duration.toNanos()); //etc

        //convert ZonedDateTime to Instance
        ZoneId zone = ZoneId.of("Africa/Harare");
        ZonedDateTime zdt = ZonedDateTime.of(2025, 11, 2, 21, 50, 14, 25, zone);
        Instant inst = zdt.toInstant();
        System.out.println();
        System.out.println(inst);


    }
}
