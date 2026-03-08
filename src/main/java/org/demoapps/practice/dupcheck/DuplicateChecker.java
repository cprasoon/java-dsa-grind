package org.demoapps.practice.dupcheck;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

    public int[] checkDuplicates(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) return new int[0];

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int val : arr) {
            if (seen.contains(val)) {
                duplicates.add(val);
            } else {
                seen.add(val);
            }
        }
        return duplicates.stream().mapToInt(Integer::intValue).toArray();
    }
}
