class Solution {
    public int[] productExceptSelf(int[] nums) {
       int prod=1;
        int zc=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
                if(zc>1){
                    return ans;
                }
            }
            else{
                prod*=nums[i];
            }
        }
        if(zc==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    ans[i]=prod;
                    break;
                }
                
            }
        }
        else{
                for(int i=0;i<nums.length;i++){
                    ans[i]=prod/nums[i];
                }
         }
        return ans;
    }
}  
