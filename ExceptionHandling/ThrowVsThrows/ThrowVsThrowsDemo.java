/*
📝 Task:
Write a program with a method that explicitly throws an exception 
(e.g., divide numbers but throw IllegalArgumentException if the denominator is zero).

Another method should declare throws for a checked exception (e.g., IOException) 
and demonstrate handling it in main.

Show the difference between throw (used inside method body) and throws (used in method signature).

🧠 Concepts Covered: throw keyword, throws clause, checked vs unchecked exception.
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class DateParser {
    private static final Logger logger = Logger.getLogger(DateParser.class.getName());
    public Date dateParse(String input) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        logger.info("Set the date and time format to: dd-MM-yyyy HH:mm:ss");
        return sdf.parse(input);
    }
}

class Divide {
    private static final Logger logger = Logger.getLogger(Divide.class.getName());
    public double division(int numerator, int denominator) throws IllegalArgumentException {
        if(denominator == 0){
            logger.warning("Division attempted with denominator as zero.");
            throw new IllegalArgumentException("Denominator can't be 0");
        } 
        logger.fine("Division successful: " + numerator + " / " + denominator + " = " + (double)numerator/denominator);
        return (double) numerator/denominator;
    } 
}

public class ThrowVsThrowsDemo {
    private static final Logger logger = Logger.getLogger(ThrowVsThrowsDemo.class.getName());
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            logger.setLevel(Level.ALL);
            Logger rootLogger = Logger.getLogger("");
            rootLogger.getHandlers()[0].setLevel(Level.ALL);
            logger.info("Program started. Object divide created for Divide class and datePar for DateParse class");
            Divide divide = new Divide();
            DateParser dateParser = new DateParser();
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            logger.fine("Entered " + numerator + " as numerator");
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            logger.fine("Entered " + denominator + " as denominator");
            System.out.println("Result: " + divide.division(numerator, denominator));
            LocalDateTime ldt = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formattedDate = ldt.format(dtf);
            System.out.println("Date: " + dateParser.dateParse(formattedDate));
        } catch (InputMismatchException e){
            logger.log(Level.SEVERE, "Invalid input", e);
            System.out.println("Error: Please enter only integer value");
        } catch (IllegalArgumentException e){
            logger.log(Level.WARNING, "Invalid argument. Denominator can not be 0", e);
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException e){
            logger.log(Level.WARNING, "Invalid date format", e);
            System.out.println("Error: Unable to parse date. Expected format: dd-MM-yyyy HH:mm:ss");
        }
        logger.info("Program ended");
    }
}
