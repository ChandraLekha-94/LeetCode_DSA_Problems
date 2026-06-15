class Solution {
    public boolean isValid(String s) {
        boolean pp=false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            }
            else {
                if(st.isEmpty()==false){
                char p=st.peek();
                if((ch=='}'&&p=='{')||(ch==']'&&p=='[')||(ch==')'&&p=='(')){
                    st.pop();

                }
                else{
                    
                    break;
                }
                }
                else{
                    st.push(ch);
                }

            }
        }
        if(st.isEmpty()){
            pp=true;

        }
        return pp;
    }
}
