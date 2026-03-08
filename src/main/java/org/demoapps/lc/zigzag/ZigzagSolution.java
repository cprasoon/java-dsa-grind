package org.demoapps.lc.zigzag;

public class ZigzagSolution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int col=0;
        int direction=+1;
        for (int i = 0;i< s.length();i++) {
            rows[col].append(s.charAt(i));
            if(col==0){
                direction=+1;
            } else if(col==numRows-1){
                direction=-1;
            }
            col=(col+direction)%numRows;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows){
            result.append(row);
        }
        return result.toString();
    }
}
