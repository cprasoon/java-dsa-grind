package org.demoapps.lc.mergeSA;

public class MergeStringAlternativelySolution {

    public String mergeAlternately(String word1, String word2) {
        //handle exteme conditions of when any of them is null
        if (word1 == null || word1.isEmpty()) {
            return word2;
        }
        if (word2 == null || word2.isEmpty()) {
            return word1;
        }

        //remainder situation
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

}
