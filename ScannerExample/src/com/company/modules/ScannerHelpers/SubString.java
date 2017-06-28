package com.company.modules.ScannerHelpers;

/**
 * Created by barkou on 1/8/2017.
 */
public class SubString extends BaseScannerClass{

    @Override
    public String createInstance() {
        System.out.println("Enter sub-string, this string will be used as regex:");
        string = scanner.nextLine();
        return string;
    }
}
