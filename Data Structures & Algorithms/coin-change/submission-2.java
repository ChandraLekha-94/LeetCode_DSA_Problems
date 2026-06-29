class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        if(amount==0)
        return 0;
        if(amount==coins[0])
        return coins[0];
        for(int i=1;i<=amount;i++){
            dp[i]=amount+1;
        }
        boolean f=false;
        for(int i=1;i<=amount;i++){
            for(int j:coins){
              if(i>=j)
              { 
                dp[i]= Math.min(dp[i],1+dp[i-j]);
              }
            }
        }
        if(dp[amount]==amount+1)
        return -1;
        return dp[dp.length-1];
    }
}
