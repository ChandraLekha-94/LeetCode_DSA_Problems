class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<asteroids.length;i++){
            int k=asteroids[i];
            boolean dest=false;
            while(st.isEmpty()==false&&st.peek()>0&&k<0){
                    if(-k==st.peek()){
                        dest=true;
                        st.pop();
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
        int arr[]=new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}