class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i:nums){
            al.add(i);
        }
        Collections.sort(al,(a,b)->a-b);
       int k=1;
       while(true){
        if(al.contains(k)){
           k++;
             continue;
        }
        else{
            break;
        }
       }
        return k;

    }
}