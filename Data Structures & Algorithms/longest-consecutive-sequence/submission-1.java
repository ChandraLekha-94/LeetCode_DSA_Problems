class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
        {
            return 0;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i:nums){
            al.add(i);

        }
        int c=0,maxc=0;
        int s=al.get(0);
        int e=al.get(al.size()-1);
        while(s<=e){
                if(al.contains(s)){
                     c++;
                     s++;
                }
                else{
                    c=0;
                    s++;
                }
                if(c>maxc){
                    maxc=c;
                }

        }
        return maxc;
    }
}
