package org.demoapps.practice.swap;

public class Swap {

    static class MyInt {
        int data;

        MyInt(int data) {
            this.data = data;
        }
    }

    public static void main() {
        MyInt a = new MyInt(10);
        MyInt b = new MyInt(90);

        System.out.printf("Before -> A: %d, B: %d %n", a.data, b.data);
        swap(a, b);
        System.out.printf("Before -> A: %d, B: %d %n", a.data, b.data);

    }

    private static void swap(MyInt a, MyInt b) {
        MyInt temp = new MyInt(a.data);
        a.data = b.data;
        b.data = temp.data;
    }

}
