class Solution {
    public boolean validPalindrome(String s) {
        int c=0,i=0,j=s.length()-1;
        boolean p=false;
        for( i=0,j=s.length()-1;i<j;){
            if(c==0&&(s.charAt(i)!=s.charAt(j))){  
                c++;
                    
                    if(palindrome(s.substring(i+1,j+1))||palindrome(s.substring(i,j))){
                        if(palindrome(s.substring(i+1,j+1))){
                                i=i+1;
                        }
                        else{
                            j=j-1;
                        }
                        continue;
                    }
                    else{
                        break;
                    }
                  
            }
            else if(s.charAt(i)==s.charAt(j)){

                i++;j--;
            }
            else if(s.charAt(i)!=s.charAt(j)){
               break;
            }
        }
            System.out.println(i+" "+j+" ");
        return i>=j;
    }
    public static boolean palindrome(String s){
        int i=0,j=s.length()-1;
        for(;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
        }
        return i>=j;
    }
}