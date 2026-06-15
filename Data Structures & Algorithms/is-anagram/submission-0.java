class Solution {
    public boolean isAnagram(String s, String t) {
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
