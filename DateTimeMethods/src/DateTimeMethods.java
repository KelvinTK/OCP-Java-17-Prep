import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeMethods {
    public static void main(String[] args){

        //Dates are immutable

        LocalDate d = LocalDate.of(2024, 1, 27);
        //LocalDate, LocalDateTime
        //plusYears(), plusMonths(), plusWeeks(), plusDays()
        //minusYears(), minusMonths(), minusWeeks(), minusDays()
        d = d.plusDays(5);
        System.out.println(d);

        //LocalTime, LocalDateTime
        //plusDays(), plusMinutes(), plusSeconds(), plusNanos()......also with minus
        LocalTime t = LocalTime.of(11, 37);
        LocalDateTime dt = LocalDateTime.of(d, t);

        t = t.minusHours(2);
        dt = dt.minusNanos(1000090);
        System.out.println();
        System.out.println(t);
        System.out.println(dt);

        //Method chaining
        System.out.println();
        System.out.println(dt);
        dt = dt.minusHours(2).plusSeconds(27);
        System.out.println(dt);

        //LocalDate, LocalTime, LocalDateTime
        //isBefore(), isAfter()
        LocalDate dte = LocalDate.of(2026, 4, 28);
        LocalDate dte2 = LocalDate.of(2024, 1, 6);
        System.out.println();
        System.out.println(dte.isBefore(dte2));

    }
}
