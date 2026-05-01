import java.util.HashSet;
import java.util.Set;

/*
136. Single Number
Solved
Easy

Topics
premium lock icon
Companies

Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1



Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber136 {
    public static void main(String[] args) {
        System.out.println(singleNumberSolution2(new int[] {2,2,1}));
        System.out.println(singleNumberSolution2(new int[] {4,1,2,1,2}));
        System.out.println(singleNumberSolution2(new int[] {1}));
    }

    public static int singleNumberSolution2(int[] nums){
        int res=nums[0];
        if(nums.length==1)
        {
            return res;
        }
        for(int i=1;i<nums.length;i++)
        {
            res = res^nums[i];
        }
        return res;
    }
}
