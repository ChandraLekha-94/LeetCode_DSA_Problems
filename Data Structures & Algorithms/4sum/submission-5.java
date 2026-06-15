class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> al=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long k=(long)target-((long)nums[i]+(long)nums[j]);
                int x=j+1,y=nums.length-1;
                while(x<y){
                    long sum=nums[x]+nums[y];
                    if(sum==k){
                        List<Integer> l=new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[x]);
                        l.add(nums[y]);
                        Collections.sort(l);
                        if(!al.contains(l)){
                            al.add(new ArrayList<>(l));
                        }
                        x++;
                        y--;
                    }
                    else if(sum<k){
                        x++;

                    }
                    else{
                        y--;
                    }
                }
            }
        }
        return al;
    }
}