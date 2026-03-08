package org.demoapps.practice.pattern;

public class PatternPrinter {

    public void printPatternAllStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void printPatternIncreasing(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPatternDecreasing(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= (n - i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPatternIncreasingAndDecreasing(int n) {
        printPatternIncreasing(n);
        printPatternDecreasing(n-1);
    }
}
