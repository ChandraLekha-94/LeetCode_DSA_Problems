class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        List<Integer> al=new ArrayList<Integer>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)>nums.length/3&&al.contains(i)==false){
                al.add(i);
            }
        }
        return al;
    }
}