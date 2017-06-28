package com.company.modules.ScannerHelpers;

import java.util.Scanner;

/**
 * Created by barkou on 1/8/2017.
 */
public class ScannerContainer {
    private static Scanner scanner = null;

    public static Scanner getScanner() {
        if (scanner == null) {
            return new Scanner(System.in);
        } else return scanner;
    }
}
