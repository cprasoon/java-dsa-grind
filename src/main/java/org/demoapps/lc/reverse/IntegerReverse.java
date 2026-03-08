package org.demoapps.lc.reverse;

public class IntegerReverse {

    public int reverse(int x) {
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }
        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            x = x / 10;
            if (result > (Integer.MAX_VALUE - remainder) / 10) {
                result = 0;
                break;
            }
            result = result * 10 + remainder;
        }
        return negative ? -result : result;
    }

}
