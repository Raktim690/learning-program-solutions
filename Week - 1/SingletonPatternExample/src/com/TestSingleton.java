package com;
public class TestSingleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Hash code of logger1: " + logger1.hashCode());
        System.out.println("Hash code of logger2: " + logger2.hashCode());
        
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        
        if (logger1 == logger2) {
            System.out.println("\nSUCCESS: Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("\nFAILURE: logger1 and logger2 refer to different instances.");
        }
    }
}
