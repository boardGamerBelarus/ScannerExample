package com.company.modules.ScannerHelpers;

import java.util.Scanner;

/**
 * Created by barkou on 1/8/2017.
 */
public abstract class BaseScannerClass {
    protected Scanner scanner = ScannerContainer.getScanner();
    protected String string = "";

    public abstract String createInstance();
}
