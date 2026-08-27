class Solution {
    public int search(int[] nums, int target) {
        int n=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                n=Arrays.binarySearch(nums,target);

            }
            
            

        }
        
        return n;
    }
}
