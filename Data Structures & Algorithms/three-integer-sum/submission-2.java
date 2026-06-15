class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> al=new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
            int t=0-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==t){
                        List<Integer> l=new ArrayList<>();
                        

                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        if(!al.contains(l)){
                            al.add(new ArrayList<Integer>(l));
                        }
                       
                       j++;k--;
                }
                else if(nums[j]+nums[k]<t){
                    j++;
                }
                else if(nums[j]+nums[k]>t){
                    k--;
                }
            }
        }
        return al;
    }
}
