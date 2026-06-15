class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> al=new ArrayList<Integer>();      
        int p=pos(arr,x);
        int c=0;
        int i=p-1,j=p;
        while(c<k&&(i>=0&&j<arr.length)){
            if(x-arr[i]<=arr[j]-x){
                al.add(0,arr[i]);
               
                c++;
                i--;
            }
            else{
                al.add(arr[j]);
                c++;
                j++;
            }
        }
        while(c<k&&(i>=0)){
            al.add(0,arr[i]);
            i--;
            c++;
        }
        while(c<k&&(j<arr.length)){
            al.add(arr[j]);
            j++;
            c++;
        }
    
      
       return al;
    }
    public static int pos(int a[],int x){ 
        int l=0,h=a.length-1,m=0;
        while(l<=h){
            m=l+((h-l)/2);
          if(a[m]==x){
            return m;
          }
          else if(a[m]<x){
           l=m+ 1;
          }
          else{
            h=m-1;
          }
        }
        return l;

        


    }
}