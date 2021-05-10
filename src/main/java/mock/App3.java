package mock;

import java.util.Arrays;
import java.util.HashMap;

public class App3 {
//    Given an array of integers nums and an integer target, returns indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
// Input: nums=[2,7,11,15], target =9
    //Output: [0,1]
    //Output: because nums[0]+nums[1]==9, we return [0,1]


    //{1,2,7,11,12,15};
    //{1,2,7,11,12,15};
    public static void main(String[] args) {

        int[] nums = {2,7,11,12,15};
        int target=13;
        System.out.println("Input: nums"+Arrays.toString(nums)+", target="+target);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]<=target) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j]<=target && j!=i)
                    if (nums[i] + nums[j] == target)
                    {
                        System.out.println("Output: is["+i+","+j+"]" + "\nOutput: Because  nums["+i+"]+nums["+j+"]=="+(nums[j]+nums[i])+", we return["+i+","+j+"]");
                    }

                }
            }
        }

}


}
