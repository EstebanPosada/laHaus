package com.lahaus;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("$210 millones");
//        while(m.find()) {
        if (m.find())
            System.out.println(m.group());
//        }
    }
}
