class Solution {
    public int subarraySum(int[] nums, int k) {
       int pfs[]=new int[nums.length];
       pfs[0]=nums[0];

       for(int i=1;i<nums.length;i++){
        pfs[i]=nums[i]+pfs[i-1];
       }
       
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
       hm.put(0,1);
       int c=0;
       for(int i=0;i<nums.length;i++){
        if(hm.containsKey(pfs[i]-k)){
            c+=hm.get(pfs[i]-k);
        }
        
            hm.put(pfs[i],hm.getOrDefault(pfs[i],0)+1);
        
       }
       return c;
    }
}