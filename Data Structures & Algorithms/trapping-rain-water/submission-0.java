class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1;
        int lmax=0,rmax=0;
        int water=0;
        while(i<j){
            if(height[i]>lmax){
                lmax=height[i];
            }
            if(height[j]>rmax){
                rmax=height[j];
            }
            int min=height[i];
            if(height[i]>height[j]){
                min=height[j];
            }
            int minMax=lmax;
            if(rmax<lmax){
                minMax=rmax;
            }
            water+=(minMax-min);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
}
