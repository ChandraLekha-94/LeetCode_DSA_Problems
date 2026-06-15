class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int t[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int s=i+1;
            boolean f=false;
            int c=0;
            while(s<temperatures.length){
                if(temperatures[s]<=temperatures[i]){
                    c++;
                    
                }
                else{
                    f=true;
                    break;
                }
                s++;
            }
            if(f){
                t[i]=c+1;
            }

        }
        return t;
    }
}
