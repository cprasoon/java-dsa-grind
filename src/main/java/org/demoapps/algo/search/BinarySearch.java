package org.demoapps.algo.search;

import org.demoapps.algo.sort.BubbleSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class BinarySearch {
    private static final Logger logger = LoggerFactory.getLogger(BubbleSort.class);

    public static int search(int[] array, int value) {
        int low = 0;
        int high = array.length;
        int location = -1;

        StringBuilder builder = new StringBuilder();
        for(int i = low; i < high; i++) {
            builder.append("["+i+"]:"+array[i]);
            if(i !=high-1){
                builder.append(",");
            }
        }
        logger.info("Search Array is:"+ builder);
        logger.info("value to search is:"+ value);

        while (low < high) {
            logger.info("Low:" + low + "/High:" + high);
            int mid = low + (high - low) / 2;
            logger.info("Mid:" + mid);

            if (array[mid] == value) {
                location = mid;
                break;
            } else if (array[mid] > value) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        logger.info("Result:" + location);
        return location;
    }
}
