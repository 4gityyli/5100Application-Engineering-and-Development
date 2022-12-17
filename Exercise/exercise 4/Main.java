import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String patternA = "https?://[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*";
        test(patternA, "http://www.google.com", true); 
        test(patternA, "https://www.hao123.com", false); 

        String patternB = "\\b[a-z]{3}\\b";
        test(patternB, "abc", true); 
        test(patternB, "abcd", false); 

        String patternC = "\\d{5}";
        test(patternC, "12345", true); 
        test(patternC, "123456", false); 
        test(patternC, "1234", false); 
  
        String patternD = "\\d{3}-\\d{3}-\\d{4}";
        test(patternD, "123-456-7890", true); 
        test(patternD, "123-456-78901", false); 
        test(patternD, "123-456-789", false);

        String patternE = "#[0-9a-fA-F]{6}";
        test(patternE, "#123456", true); 
        test(patternE, "#1234567", false); 
        test(patternE, "#12345", false); 


    }

    public static void test(String pattern, String subject, boolean expectedResult) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(subject);
        boolean result = m.matches();
        if (result == expectedResult) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }
}
