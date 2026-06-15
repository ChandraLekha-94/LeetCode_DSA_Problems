class Solution {
    public boolean isPalindrome(String s) {
      s=convert(s);
       char c[]=s.toCharArray();
       int i=0,j=c.length-1;
       for(i=0;i<j;i++,j--){
        if(c[i]==c[j]){
            continue;
        }
        else{
            break;
        }
       }
        if(i<j){
            return false;
        }
        else{
            return true;
        }
    }
    public static String convert(String s){
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
