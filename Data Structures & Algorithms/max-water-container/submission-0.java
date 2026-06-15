class Solution {
    public int maxArea(int[] heights) {
        int l=heights.length;
        int i=0,j=l-1;
        int maxWater=0;
        while(i<j){
            int s=heights[i];
            if(heights[j]<heights[i]){
                s=heights[j];
            }
            int width=j-i;
            int water=s*width;
            if(water>maxWater){
                maxWater=water;
            }
            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return maxWater;
    }
}
