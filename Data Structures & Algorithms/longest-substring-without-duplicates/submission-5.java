class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int max=0;
        int e=0;
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))+1>start)
                start=hm.get(s.charAt(i))+1;   
            }
            hm.put(s.charAt(i),i);
             e=i;
            if(e-start+1>max){
                max=e-start+1;
            }
        }
        return max;

    }
}
