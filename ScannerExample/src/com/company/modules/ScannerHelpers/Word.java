package com.company.modules.ScannerHelpers;

/**
 * Created by barkou on 1/7/2017.
 */
public class Word extends BaseScannerClass {

    @Override
    public String createInstance() {
        System.out.println("Enter word:");
        string = scanner.next();
        return string;
    }
}
