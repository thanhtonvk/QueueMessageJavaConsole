package com.company;

public class StringUtilities {
    public static int checkString(String value){
        if(value.equals("")) return 1;
        else if(value.length()>250) return 2;
        return 0;
    }
}
