class Solution {
    public int mySqrt(int x) {
        long l=1,h=x;
        long m;
        while(l<=h){
            m=l+((h-l)/2);
            if(m*m==x){
                return (int)m;
            }
            else if(m*m>x){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return (int)h;
    }
}