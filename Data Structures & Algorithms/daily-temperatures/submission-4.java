class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(st.isEmpty()==false&&temperatures[st.peek()]<temperatures[i]){
                int k=st.pop();
                arr[k]=i-k;
            }
            st.push(i);
        }
        return arr;
    }
}
