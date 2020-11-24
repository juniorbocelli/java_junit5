package com.bocelli.ifsp.tcp.model.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
    private static boolean applyPattern(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find())
            return true;
        else
            return false;
    }

    public static boolean isCpf(String input) {
        String pattern = "([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})$";
        return  applyPattern(pattern, input.toUpperCase());
    }

    public static boolean isEmail(String input){
        String pattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        return applyPattern(pattern, input);
    }

    public static boolean isPhone(String input) {
        String pattern = "^\\(\\d{2}\\)\\d{4}\\-\\d{4}$";
        return applyPattern(pattern, input);
    }

    public static boolean isMoney(String input){
        String pattern = "^[0-9]+(,[0-9]{1,2})?$";
        return applyPattern(pattern, input);
    }

    public static boolean isPlateLetters(String input) {
        String pattern = "^[A-Z]{3}$";
        return  applyPattern(pattern, input.toUpperCase());
    }

    public static boolean isPlateNumbers(String input) {
        String pattern = "^[0-9]{4}$";
        return  applyPattern(pattern, input);
    }
}
