class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int r=text1.length()+1;
        int c=text2.length()+1;
        int t[][]=new int[r][c];
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[r-1][c-1];

    }
}
