import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    //Formatting numbers
    /*
        - to format numbers, we have to use NumberFormat interface
        - already discussed methods:
            public final String format(double number)
            public final String format(long number)
        - now we will introduce the concrete class DecimalFormat, which includes the constructor that takes a String pattern:
            public DecimalFormat(String pattern)
        - to create a pattern, we need to know formatting chars:
            # - omit position if no digit exists for it, eg., $4.5
            0 - put 0 in position if no digit exists for it, eg., $004.50
    */

    //Formating Date and Time
    /*
        - to display standard formats, Java provides a class called DateTimeFormatter
        - you can use pre-defined formats, eg. ISO_LOCAL_DATE
        - ..or create your own String format using ofPattern() method
            - used with common date/time symbols:
                - y = year
                - M = month
                - d = day
                - h = hour
                - m = minute
                - S = second
                - a = a.m/p.m
                - z = time zone name
                - Z = time zone offset
    */
    public static void main(String[] args){

        //Numbers
        double num = 45678793.90847898;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(num));
        System.out.println();

        NumberFormat f2 = new DecimalFormat("000,000,000000");
        System.out.println(f2.format(num));
        System.out.println();

        NumberFormat f3 = new DecimalFormat("Balance: $###,###, ###.##");
        System.out.println(f3.format(num));
        System.out.println();

        //Date and time
        LocalDate date = LocalDate.of(2024, Month.FEBRUARY, 4);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());
        //to display standard formats
        LocalTime time = LocalTime.of(13, 35, 56);
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        //custom formats
        var f01 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh.mm.ss");
        System.out.println(dt.format(f01));
        System.out.println();

        var f02 = DateTimeFormatter.ofPattern("MMM-dd-yyyy HH:mm:ss");
        System.out.println(dt.format(f02));
        System.out.println();

        var f03 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy hh:mm:ss a");
        System.out.println(dt.format(f03));
//        System.out.println(f3.format(dt));
        System.out.println();

        //to insert text values use single quotes
        var f04 = DateTimeFormatter.ofPattern("'Date: 'MMM-dd-yyyy 'Time:' HH:mm:ss a");
        System.out.println(dt.format(f04));
        System.out.println();

        var f05 = DateTimeFormatter.ofPattern("MMM-dd-yyyy 'at' HH'h' m'm' ss's' a");
        System.out.println(dt.format(f05));
        System.out.println();

    }
}
