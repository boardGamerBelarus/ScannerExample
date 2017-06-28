package com.company;

import com.company.modules.*;
import com.company.modules.ScannerHelpers.*;

public class Main {

    // После каждого слова текста, заканчивающегося заданной под¬строкой, вставить указанное слово.

    public static void main(String[] args) {

        Sentence sentence = new Sentence();
        StringBuilder stringBuilder = new StringBuilder(sentence.createSentence());

        BaseScannerClass subString = new SubString();
        String stringSub = subString.createInstance();

        BaseScannerClass word = new Word();
        String stringWord = word.createInstance();

        MatcherHelper matcherHelper = new MatcherHelper(stringBuilder,stringSub,stringWord);
        matcherHelper.insertSubString();
    }
}

