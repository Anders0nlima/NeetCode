package ArraysHashing;

public class ContainsDuplicate {
        public boolean hasDuplicate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            ArraysHashing.ContainsDuplicate containsDuplicate = new ArraysHashing.ContainsDuplicate();
            int[] nums = {1, 2, 3, 4, 5, 6};
            boolean result = containsDuplicate.hasDuplicate(nums);
            System.out.println("O array tem duplicados? " + result);
        }

}
