class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void MergeSort(int a[],int s,int e){
        if(s<e){
            int m=s+((e-s)/2);
            MergeSort(a,s,m);
            MergeSort(a,m+1,e);
            Merge(a,s,m,m+1,e);
        }

    }
    public static void Merge(int a[],int ls,int le,int rs,int re){
        int las=le-ls+1;
        int ras=re-rs+1;
        int la[]=new int[las];
        for(int i=0;i<las;i++){
            la[i]=a[i+ls];
        }
        int ra[]=new int[ras];
        for(int j=0;j<ras;j++){
            ra[j]=a[j+rs];
        }
        int i=0,j=0,k=ls;
        while(i<las&&j<ras){
            if(la[i]<ra[j])
            {
                a[k]=la[i];
                i++;
                k++;
            }
            else{
                a[k]=ra[j];
                j++;
                k++;
            }
        }
        while(i<las){
            a[k]=la[i];
            i++;
            k++;
        }
        while(j<ras){
            a[k]=ra[j];
            j++;
            k++;
        }
    }
}