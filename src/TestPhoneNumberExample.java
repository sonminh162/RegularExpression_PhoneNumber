public class TestPhoneNumberExample {
    private static RegularExpression_PhoneNumber phoneNumberExample;
    public static final String validPhoneNumber = "(84)-(0978489648)";
    public static final String invalidPhoneNumber = "(a8)-(2222222222)";

    public static void main(String[] args) {
        phoneNumberExample = new RegularExpression_PhoneNumber();
        boolean isvalid = phoneNumberExample.validate(validPhoneNumber);
        System.out.println("Phone Number: "+validPhoneNumber+" is valid: "+isvalid);
        boolean invalid = phoneNumberExample.validate(invalidPhoneNumber);
        System.out.println("Phone Number: "+invalidPhoneNumber+" is valid: "+invalid);
    }
}
