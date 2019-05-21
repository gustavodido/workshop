import java.util.regex.Pattern;

public class RegExpWorkshop {
    public String replaceNonAlphanumericChars(String input) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        return pattern.matcher(input).replaceAll("");
    }
}
