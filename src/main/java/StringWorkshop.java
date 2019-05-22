import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StringWorkshop {
    public String replaceNonAlphanumericChars(String input) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        return pattern.matcher(input).replaceAll("");
    }
}
