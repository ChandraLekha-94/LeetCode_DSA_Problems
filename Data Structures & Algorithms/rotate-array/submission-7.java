class Solution {
    public void rotate(int[] nums, int k) {
       ArrayList<Integer> al=new ArrayList<>();
       if(k>nums.length){
        k=k%nums.length;
       }
       int t=nums.length-k;
       for(int i=t;i<nums.length;i++){
        al.add(nums[i]);
       }
       for(int i=0;i<t;i++)
       {
        al.add(nums[i]);
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=al.get(i);
       }
    }
}