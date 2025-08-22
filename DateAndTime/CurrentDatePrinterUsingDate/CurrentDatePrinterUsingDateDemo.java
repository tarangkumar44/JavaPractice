/*
🧪 Objective: Understand how the old Date class worked before java.time was introduced.

💬 Task:
Write a Java program using the deprecated java.util.Date class to print the current system date and time.
Then, extract and print the following using appropriate Date methods (even if deprecated — this is intentional for learning):
Year
Month
Date
Hour
Minute
Second

🔍 Constraints:
Use only java.util.Date (not Calendar or java.time yet).
Print each component with clear labeling.
Use the deprecated methods intentionally so you can later understand why they were replaced.
*/

import java.util.Date;

public class CurrentDatePrinterUsingDateDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Year: " + (date.getYear() + 1900));
        System.out.println("Month: " + (date.getMonth() + 1));
        System.out.println("Date: " + date.getDate());        
        System.out.println("Hour: " + date.getHours());
        System.out.println("Minutes: " + date.getMinutes());
        System.out.println("Second: " + date.getSeconds());
    }
}
