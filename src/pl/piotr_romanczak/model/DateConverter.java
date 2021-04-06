package pl.piotr_romanczak.model;

import pl.piotr_romanczak.AdditionalMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
    public static String dateConverter (long date) {
        return new SimpleDateFormat("HH:mm").format(new Date(date*1000));
    }
    public static String getDayName (long date) {
        return AdditionalMethods.capitalize(AdditionalMethods.removeLastCharacter(new SimpleDateFormat("E").format(new Date(date*1000))))+
                " " + new SimpleDateFormat("dd").format(new Date(date*1000));
    }
}
