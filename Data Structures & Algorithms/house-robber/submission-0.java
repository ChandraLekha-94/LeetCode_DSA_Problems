class Solution {
    public int rob(int[] nums) {
        int t[]=new int[nums.length];
        t[0]=nums[0];
        if(nums.length>1){
            t[1]=Math.max(t[0],nums[1]);
        }
        for(int i=2;i<nums.length;i++){
            t[i]=Math.max(t[i-1],t[i-2]+nums[i]);
        }
        return t[nums.length-1];
    }
}
