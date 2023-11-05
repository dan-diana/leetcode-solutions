package org.example.algotithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static int[] twoSumUsingMap(int[] nums, int target) {

        Map<Integer, Integer> element2Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            element2Index.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (element2Index.get(diff) != null && i != element2Index.get(diff)) {
                return new int[]{i, element2Index.get(diff)};
            }
        }

        return new int[]{};
    }
}
