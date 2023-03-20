import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        // Positive case: match a string containing a valid date in the format dd/mm/yyyy
        String date1 = "18/03/2023";
        String datePattern = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)$";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(date1);
        System.out.println("Date 1: " + date1);
        if (matcher.matches()) {
            System.out.println("Valid date in dd/mm/yyyy format.");
        } else {
            System.out.println("Invalid date in dd/mm/yyyy format.");
        }

        // Negative case: match a string containing a name that does not start with an uppercase letter
        String name1 = "Constance Li";
        String namePattern = "^[A-Z][a-z]*\\s[A-Z][a-z]*$";
        pattern = Pattern.compile(namePattern);
        matcher = pattern.matcher(name1);
        System.out.println("Name 1: " + name1);
        if (matcher.matches()) {
            System.out.println("Valid name starting with an uppercase letter.");
        } else {
            System.out.println("Invalid name not starting with an uppercase letter.");
        }

        // Positive case: match a string containing a valid time in the format hh:mm:ss
        String time1 = "20:39:19";
        String timePattern = "^([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$";
        pattern = Pattern.compile(timePattern);
        matcher = pattern.matcher(time1);
        System.out.println("Time 1: " + time1);
        if (matcher.matches()) {
            System.out.println("Valid time in hh:mm:ss format.");
        } else {
            System.out.println("Invalid time in hh:mm:ss format.");
        }

        // Negative case: match a string containing a phone number that does not start with a digit
        String phoneNumber1 = "abc-894-0413";
        String phonePattern = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
        pattern = Pattern.compile(phonePattern);
        matcher = pattern.matcher(phoneNumber1);
        System.out.println("Phone number 1: " + phoneNumber1);
        if (matcher.matches()) {
            System.out.println("Valid phone number starting with a digit.");
        } else {
            System.out.println("Invalid phone number not starting with a digit.");
        }

        // Positive case: match a string containing a valid email address
        String email1 = "li.xueyin@northeastern.edu";
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        pattern = Pattern.compile(emailPattern);
        matcher = pattern.matcher(email1);
        System.out.println("Email 1: " + email1);
        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
}
