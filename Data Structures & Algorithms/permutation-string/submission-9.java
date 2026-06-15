class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean f=false;
        for(int i=0;i<=s2.length()-s1.length();i++){
            String k=s2.substring(i,i+s1.length());
            if(map(s1).equals(map(k))){
                f=true;
                break;
            }
        }
       
        return f;
    }
    public static HashMap<Character,Integer>  map(String s){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        return hm;
    }
}
