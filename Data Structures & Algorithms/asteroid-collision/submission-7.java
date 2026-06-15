class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int k=asteroids[i];
            boolean dest=false;
            while(!st.isEmpty()&&(k<0 &&st.peek()>0)){
                if(-k==st.peek()){
                    st.pop();
                    dest=true;
                    break;

                }
                else if(-k>st.peek()){
                    st.pop();
                    
                }
                else{
                    dest=true;
                    break;
                }
            }
            if(!dest){
                st.push(k);
            }
        }
        int res[]=new int[st.size()];
        for(int i=0;i<res.length;i++){
            res[res.length-i-1]=st.pop();
        }
        return res;
    }
}