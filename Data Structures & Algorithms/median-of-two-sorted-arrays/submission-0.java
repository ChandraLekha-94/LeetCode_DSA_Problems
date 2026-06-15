class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float res[]=new float[nums1.length+nums2.length];
        merge(res,nums1,nums2);
        System.out.println( Arrays.toString(res));
        int k=res.length;
        if(k%2==0){
            return ((res[k/2]+res[(k/2)-1])/2);
        }
        else{
            return res[k/2];
        }
        
    }
    public static void merge(float res[],int nums1[],int nums2[])
    {
        int k=res.length-1;
        int i=nums1.length-1;
        int j=nums2.length-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                res[k--]=nums1[i--];

            }
            else{
                res[k--]=nums2[j--];
            }
        }
        while(i>=0){
            res[k--]=nums1[i--];
        }
        while(j>=0){
            res[k--]=nums2[j--];
        }
    }
}
