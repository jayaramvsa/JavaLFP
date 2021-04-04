package com.learning.jay.util;


import java.util.function.Predicate;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateConstraints {
    public boolean checkValidValue(String customerData);

}

public class Validation {


    public static boolean validateUserDetails(String strFistName, String strLastName, String strEmailId, String strPhoneNo, String strPassWord) throws Exception {

        return (nameValidation(strFistName, strLastName) && emailValidation(strEmailId) &&
                phoneValidation(strPhoneNo) && passwordValidation(strPassWord));
    }

    private static boolean passwordValidation(String strPassWord) throws Exception {
        Predicate<String> strPasswordLength = password -> password.length() >= 8;
        String specialRegex = "(.*[@,#,$,%,!,^,&,*,(,)].*$)";
        Predicate<String> strSpecialCharacters = specialCharacters -> specialCharacters.matches(specialRegex);
        if (!strPasswordLength.test(strPassWord))
            throw new Exception("** Password must contain 8 characters minimum ");
        if (!strPassWord.chars().anyMatch(pass -> Character.isUpperCase(pass)))
            throw new Exception("*** Password Must contain at least one Uppercase");
        if (!strPassWord.chars().anyMatch(pass -> Character.isDigit(pass)))
            throw new Exception("*** Password must contain at least one Numerical");
        if (!strSpecialCharacters.test(strPassWord))
            throw new Exception("*** Password must contain One Special Character");
        else return true;
    }

    private static boolean phoneValidation(String strPhoneNo) throws Exception {
        //String indPhoneRegex = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)";
        String phoneRegex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Predicate<String> phonePattern = p -> pattern.matcher(p).matches();
        ValidateConstraints validatePhone = p -> phonePattern.test(p);
        if (!validatePhone.checkValidValue(strPhoneNo)) {
            throw new Exception("** Please Enter Valid phone no for example +91 97000 50000 **");
        } else return true;
    }

    private static boolean emailValidation(String strEmailId) throws Exception {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9-.]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Predicate<String> emailPattern = e -> pattern.matcher(e).matches();
        ValidateConstraints validateEmail = e -> emailPattern.test(e);
        if (!validateEmail.checkValidValue(strEmailId))
            throw new Exception("** Please Enter Valid Email Id for example abc@gmail.com or abc@edu.co.in **");
        else return true;
    }

    private static boolean nameValidation(String strFistName, String strLastName) throws Exception {
        Predicate<String> firstUpperCase = s -> Character.isUpperCase(s.charAt(0));
        Predicate<String> minThreeLetterString = s -> s.chars().filter(letters -> Character.isLetter(letters)).count() >= 3;
        ValidateConstraints validateName = s -> firstUpperCase.and(minThreeLetterString).test(s);

        if (!(validateName.checkValidValue(strFistName)) || !(validateName.checkValidValue(strLastName)))
            throw new Exception("** Please Enter Valid First Name & Last Name with First letter as Caps and Minimum 3 Letters **");
        else return true;
    }
}
