package ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] TwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];

    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        int[] result = twoSum.TwoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
