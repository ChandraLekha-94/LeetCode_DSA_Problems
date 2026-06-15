class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max=0;
        int ind=0;
        int res[]=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
            if(i>=k-1){
                if(max<=i&&max>=i-k+1){
                    res[ind++]=nums[max];
                }
                else{
                    int j=i-k+1;
                     max=j;
                    while(j<=i){
                        if(nums[j]>nums[max]){
                            max=j;
                        }
                        j++;
                    }
                    res[ind++]=nums[max];
                }
            }


        }
        return res;
    }
}
