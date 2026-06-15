class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("+")){
                int arr[]=new int[3];
                 arr[1]=st.pop();
                 arr[0]=st.pop();
                arr[2]=arr[0]+arr[1];
                st.push(arr[0]);
                st.push(arr[1]);
                st.push(arr[2]);
               
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int t=st.peek();
                st.push(2*t);
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
       
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}