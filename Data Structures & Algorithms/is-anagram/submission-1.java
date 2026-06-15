class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()){
        return false;
    }
    else{
           char a[]= s.toCharArray();
       char b[]= t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
  
       if(String.copyValueOf(a).equals(String.copyValueOf(b))){
            return true;
       }
       else{
        return false;
       }
    }

    }
}
