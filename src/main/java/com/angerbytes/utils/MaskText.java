package com.angerbytes.utils;

public class MaskText {

    public static String phone(String text){
        text = text.startsWith("0") ? text.substring(1) : text;
        return String.format("(%s) %s-%s",
                text.substring(0,2),
                text.substring(2,7),
                text.substring(7)
        );
    }
}
