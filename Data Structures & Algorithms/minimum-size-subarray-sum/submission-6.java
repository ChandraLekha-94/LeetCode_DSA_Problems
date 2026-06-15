class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
      
        int len=0,min=nums.length;
        int ps=0;
        tm.put(0,-1);
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            if(i==0&&ps>=target){
                return 1;
            }
           
            if(tm.floorKey(ps-target)!=null){
            
               int t=tm.floorKey(ps-target);
               len=i-tm.get(t);
               
                if(len<min){
                    min=len;
                }
                f=true;
            }
            tm.put(ps,i);
           
        }
        if(f)
        return min;
        else
        return 0;
    }
}