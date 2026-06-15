class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        String arr[]=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            char c[]=strs[i].toCharArray();
            Arrays.sort(c);
            arr[i]=String.copyValueOf(c);
        }
        //System.out.println(Arrays.toString(arr));
        ArrayList<String> al=new ArrayList<String>();
        for(String s:arr){
            if(al.isEmpty()||al.contains(s)==false){
                al.add(s);
            }
        }
        for(int i=0;i<strs.length;i++)
        {
            if(al.contains(arr[i])){
                list.add(new ArrayList<String>());
                list.get(list.size()-1).add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(arr[i].equals(arr[j])){
                        list.get(list.size()-1).add(strs[j]);
                    }
                }
                al.remove(arr[i]);
            }
        }
        
        return list ;
    }
}
