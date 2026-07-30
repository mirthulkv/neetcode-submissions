class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);

        int consecutive = 1;
        int longestConsecutive = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1] + 1) {
                consecutive++;
                longestConsecutive = Math.max(longestConsecutive, consecutive);
            } else if (nums[i] == nums[i - 1]) {
                continue;
            }
            else{
                consecutive=1;
            } 
        }

        return longestConsecutive;
    }
}
