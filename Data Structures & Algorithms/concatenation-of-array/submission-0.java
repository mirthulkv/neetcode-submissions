class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num=new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++){
            if(i<=nums.length-1){
                num[i]=nums[i];
            }
            else{
                num[i]=nums[i-nums.length];
            }
        }
        return num;

            
        
    }
}