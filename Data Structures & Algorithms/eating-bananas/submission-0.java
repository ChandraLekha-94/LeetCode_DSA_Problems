class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int i:piles){
            if(i>high){
                high=i;
            }
        }
       // System.out.println(low+" "+high);
        while(low<=high){
         int m=low+((high-low)/2);
         int th=0;
         for(int i:piles){
            th+=Math.ceil((double)i/m);
         }
       //  System.out.print(th+" ");
         if(th<=h){

            high=m-1;
         }
         else if(th>h){
            low=m+1;
         }
            //System.out.println(low+"  "+m+" "+high);
        }
        return low;
    }
}
