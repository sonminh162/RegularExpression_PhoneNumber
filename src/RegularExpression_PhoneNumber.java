import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression_PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String STRING_REGEX = "^[(]{1}+[0-9]{2}+[)]{1}+[-]{1}+[(]{1}+[0]{1}+[0-9]{9}+[)]{1}";

    public RegularExpression_PhoneNumber(){
        pattern = Pattern.compile(STRING_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
