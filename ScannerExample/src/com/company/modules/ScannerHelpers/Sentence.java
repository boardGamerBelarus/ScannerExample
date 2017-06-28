package com.company.modules.ScannerHelpers;

import java.util.Scanner;

/**
 * Created by barkou on 1/7/2017.
 */
public class Sentence {
    private Scanner scanner = ScannerContainer.getScanner();
    private StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder createSentence(){
        System.out.println("Enter \"exit\" from new line to finish.");
        System.out.println("Enter sentence:");
        for (String str = scanner.nextLine(); !str.equals("exit"); str = scanner.nextLine()) {
            stringBuilder.append(str);
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder;
    }
}
