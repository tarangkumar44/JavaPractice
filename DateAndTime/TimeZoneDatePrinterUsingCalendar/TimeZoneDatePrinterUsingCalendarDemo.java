/*
💬 Task
Write a Java program that:
Prints the current date and time in your default system time zone.
Prints the current date and time in GMT.
Prints the current date and time in "America/New_York".

🔍 Constraints
Use Calendar + TimeZone.
Do not use java.time yet.
Print all three outputs clearly with labels.
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDatePrinterUsingCalendarDemo {
    public static void main(String[] args) {
        Calendar defaultTimeZone = Calendar.getInstance();
        SimpleDateFormat defaultFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        defaultFormat.setTimeZone(defaultTimeZone.getTimeZone());
        System.out.println("Default date and time: " + defaultFormat.format(defaultTimeZone.getTime()));

        Calendar gmtTimeZone = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        SimpleDateFormat gmtFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        gmtFormat.setTimeZone(gmtTimeZone.getTimeZone());
        System.out.println("Current date and time in GMT: " + gmtFormat.format(gmtTimeZone.getTime()));
        
        Calendar americaTimeZone = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        SimpleDateFormat americaFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        americaFormat.setTimeZone(americaTimeZone.getTimeZone());
        System.out.println("American date and time: " + americaFormat.format(americaTimeZone.getTime()));
        
        
    }
}
