class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
            if((map.get(num)>nums.length/3)&&(!list.contains(num))){
                list.add(num);
            }
        }
        
        return list;
        
    }
}