package com.company;

import java.util.concurrent.ExecutionException;

public class ExceptionTester {

    public static void main(String[] args) {
        ExceptionA exceptionA = new ExceptionA("ExceptionA");
        ExceptionB exceptionB = new ExceptionB("ExceptionB");
        ExceptionC exceptionC = new ExceptionC("ExceptionC");

        throwExceptions(exceptionA);
        throwExceptions(exceptionB);
        throwExceptions(exceptionC);
    }

    private static void throwExceptions(ExceptionA exceptionA) {
        try {
            throw exceptionA;
        } catch (ExceptionA e) {
            System.err.println(exceptionA);
        }
    }
}
