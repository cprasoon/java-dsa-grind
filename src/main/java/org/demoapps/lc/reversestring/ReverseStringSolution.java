package org.demoapps.lc.reversestring;

import java.util.ArrayList;

public class ReverseStringSolution {
    public String reverseWords(String s) {
        //Take care of extreme conditions first
        if (s == null || s.isEmpty()) {
            return s;
        }

        ArrayList<String> words = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                words.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        words.add(sb.toString());
        sb = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            if (!word.isEmpty()) {
                sb.append(word);
                sb.append(' ');
            }
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}
