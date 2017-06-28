package com.company.modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by barkou on 1/8/2017.
 */
public class MatcherHelper {

    private String regPattern;
    private StringBuilder stringBuilder;
    private String word;

    public MatcherHelper(StringBuilder stringBuilder, String regPattern, String word) {
        this.regPattern = regPattern;
        this.stringBuilder = stringBuilder;
        this.word = word;
    }

    public void insertSubString() {
        Pattern pattern = Pattern.compile(regPattern);
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            System.out.println(matcher.replaceAll(matcher.group() + word));
        }
    }
}
