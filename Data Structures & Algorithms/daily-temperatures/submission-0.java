class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days=new int[temperatures.length];
            Arrays.fill(days,0);
        
        for(int i=0;i<temperatures.length;i++){
            int count=0;
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    count=j-i;
                    break;
                }
            }
            days[i]=count;
        }
        return days;
        
    }
}
