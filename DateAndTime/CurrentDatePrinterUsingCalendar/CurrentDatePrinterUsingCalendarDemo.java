/*
🧪 Objective: Learn how to extract date/time components using the Calendar class.

💬 Task
Write a Java program that:
Uses Calendar.getInstance() to obtain the current date and time.
Prints the following separately with proper labels:
Year
Month
Day of Month
Hour (24-hour format)
Minute
Second
Ensure correct handling of 0-based months (January = 0, December = 11).

🔍 Constraints
Do not use java.util.Date or java.time in this program.
Output should be human-friendly (Year 2025, Month 8 for August, etc.).
Follow clean coding practices (variables where needed, readable output). 
*/

import java.util.Calendar;

public class CurrentDatePrinterUsingCalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        
        /* 
        Hour Selection
            Calendar.HOUR → This gives 12-hour format (0–11).
            Use Calendar.HOUR_OF_DAY (0–23).
        */
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day Of Month: " + dayOfMonth);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }
}
