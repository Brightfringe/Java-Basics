import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DatesAndTimes {
    public static void main(String[] args) {
       // LocalDateTime dateTime = LocalDateTime.now();
       // System.out.println(dateTime);

       // Instant instant = Instant.now();
       // System.out.println(instant);

        //CUSTOM FORMAT

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);
    }
}
