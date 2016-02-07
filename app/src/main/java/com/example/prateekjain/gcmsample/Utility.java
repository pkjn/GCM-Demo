package com.example.prateekjain.gcmsample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Prateek on 06-Feb-16.
 */
public class Utility {
    private static Pattern pattern;
    private static Matcher matcher;
    //Email Pattern
    private static final String PHONE_PATTERN ="[1-9][0-9]{9,14}";

    /**
     * Validate Email with regular expression
     *
     * @param email
     * @return true for Valid Email and false for Invalid Email
     */
    public static boolean validate(String email) {
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
