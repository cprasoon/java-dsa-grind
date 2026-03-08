package org.demoapps.practice.swap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Swap {

    Logger logger = LoggerFactory.getLogger("swap");

    static class MyInt {
        int data;

        MyInt(int data) {
            this.data = data;
        }
    }

    public static void main() {
        new Swap().doSwap(new MyInt(10), new MyInt(90));
    }

    public void doSwap(MyInt a, MyInt b) {
        logger.info("Before -> A: {}, B: {}", a.data, b.data);
        MyInt temp = new MyInt(a.data);
        a.data = b.data;
        b.data = temp.data;
        logger.info(" After -> A: {}, B: {}", a.data, b.data);
    }

}
