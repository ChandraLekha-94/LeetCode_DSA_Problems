class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int t[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(st.isEmpty()==false&&temperatures[st.peek()]<temperatures[i]){
                int p=st.pop();
                t[p]=i-p;
            }
            st.push(i);
        }
        return t;
    }
}
