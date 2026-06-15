class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashMap<Integer,Integer> hm=new HashMap<>();
      boolean f=false;
      int val=0,minval=nums.length;
      for(int i=0;i<nums.length;i++){
        if(hm.containsKey(nums[i])){
            val=i-hm.get(nums[i]);
            f=true;
            hm.put(nums[i],i);
            if(val<minval){
                minval=val;
            }
        }
        else{
            hm.put(nums[i],i);
        }
      }  
      if(f&&val<=k)
      return true;
      else
      return false;
    }
}