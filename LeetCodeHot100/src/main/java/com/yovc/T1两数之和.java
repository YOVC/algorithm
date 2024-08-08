package com.yovc;

import java.util.HashMap;

/**
 * @Author: ymj
 * @Date: 2024/08/08/16:46
 * @Description: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那两个整数，并返回它们的数组下标。
 *                  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *                  你可以按任意顺序返回答案。
 */
public class T1两数之和 {
    public static void main(String[] args) {
        int[] ints = {2, 7, 11, 15};
        int target = 9;
        for (int count : twoSum(ints, target)) {
            System.out.println(count);
        }
    }

    /**
     * 时间复杂度O(N)
     * 空间复杂度O(N)
     */
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int count = 0; count < nums.length; count++) {
            if (map.containsKey(target-nums[count])){
                return new int[]{map.get(target - nums[count]),count};
            }
            map.put(nums[count],count);
        }

        return new int[0];
    }


    /**
     * 暴力枚举
     */
    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

}
