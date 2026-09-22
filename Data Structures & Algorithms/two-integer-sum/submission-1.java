public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index
        int[] list= new int[2];

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                
                list[0]=(Math.min(indices.get(diff),i));
                list[1]=(Math.max(indices.get(diff),i));

            }
        }

        return list;
    }
}
