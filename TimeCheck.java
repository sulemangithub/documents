import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeCheck {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        currentDateTime = currentDateTime.plusHours(12);

        // Check if the current time is between 5 PM and 8 AM next day
        boolean isBetween = isBetween5PMand8AM(currentDateTime);

        // Display the result
        System.out.println(" Output " + isBetween);
    }

    private static boolean isBetween5PMand8AM(LocalDateTime dateTime) {
        // Define the start time (5 PM) and end time (8 AM next day)
        LocalDateTime startTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(17, 0));
               
        LocalDateTime endTime = startTime.plusHours(15);

        System.out.println(startTime);
        System.out.println(dateTime);
        System.out.println(endTime);
        
        // Check if the current time is between the specified range
        return dateTime.isAfter(startTime) && dateTime.isBefore(endTime);
    }
}
