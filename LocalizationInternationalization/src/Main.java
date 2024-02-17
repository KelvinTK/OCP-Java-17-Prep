import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    //Localization
    /*
        - you can make your program adaptable to multiple locales of geographic regions
        - this includes:
            - translating strings to different languages
            - outputting dates in the correct formats
            - outputting numbers in the correct formats etc
    */

    //Localizing numbers
    /*
        - different countries have different conventions when it comes to numbers
        - localization can help to display the numbers in the appropriate formats
        - for this purpose we use NumberFormat factory methods
    */
    public static void main(String[] args) throws ParseException {
        //picking a locale
        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale);
        System.out.println(Locale.ITALIAN);
        System.out.println(Locale.ITALY);
        System.out.println(new Locale("sh", "ZW"));
        System.out.println();

        //creating a locale
        Locale locale = new Locale.Builder()
                .setLanguage("sh")
                .setRegion("ZW")
                .build();
        System.out.println(locale);
        System.out.println();

        Locale.setDefault(locale);
        System.out.println(Locale.getDefault());

        //formatting numbers
        double num = 345637843.894874;
        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(num));
        System.out.println();

        var it = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(it.format(num));
        System.out.println();

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(num));
        System.out.println();

        //formatting currencies
        var usc = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(usc.format(num));
        System.out.println();

        var ukc = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(ukc.format(num));
        System.out.println();

        var gerc = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(gerc.format(num));
        System.out.println();

        //formatting percentages
        double discount = 0.123;
        var usp = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(usp.format(discount));
        System.out.println();

        var gerp = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(gerp.format(discount));
        System.out.println();

        //Parsing numbers - throws ParseException
        String myNum = "15.72";
        var usn = NumberFormat.getInstance(Locale.US);
        System.out.println(usn.parse(myNum));

        var frn = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(frn.parse(myNum)); //gives error. decimal is a comma and NOT a dot
        System.out.println();

        String price = "563,772,525.67";
        var usc2 = NumberFormat.getInstance(Locale.US);
        double priceValue = (Double) usc2.parse(price);
        System.out.println(priceValue);
        System.out.println();

        //using CompactNumberFormat
        int nuum = 65_675_657;
        var us1 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        var us2 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(us1.format(nuum));
        System.out.println(us2.format(nuum));
        System.out.println();

        var ger1 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);
        var ger2 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG);
        System.out.println(ger1.format(nuum));
        System.out.println(ger2.format(nuum));
        System.out.println("-----------------------");
        System.out.println();

        //formatting Date and Time
        var dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        var fr = new Locale("fr", "FR");
        var dt = LocalDateTime.of(2024, 2, 4, 15, 50, 55);
        System.out.println(dtf.withLocale(fr).format(dt));
        System.out.println();

        var dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        var us3 = new Locale("en", "US");
        System.out.println(dtf.withLocale(fr).format(dt));
        System.out.println(dtf2.withLocale(us3).format(dt));
        System.out.println();

        var hr = new Locale("hr", "HR");
        var price1 = 4.32;
        System.out.println(hr.getDisplayLanguage());
        System.out.println(hr.getDisplayCountry());
        System.out.println(NumberFormat.getCurrencyInstance(hr).format(price1));

    }
}
