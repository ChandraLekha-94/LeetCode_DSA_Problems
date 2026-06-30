class Solution {
    public int minPathSum(int[][] grid) {
        int p[][]=new int[grid.length][grid[0].length];
        p[0][0]=grid[0][0];
        for(int i=1;i<grid.length;i++){
            p[i][0]=grid[i][0]+p[i-1][0];
        }
        for(int j=1;j<grid[0].length;j++){
            p[0][j]=grid[0][j]+p[0][j-1];
        }
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                p[i][j]=grid[i][j]+Math.min(p[i][j-1],p[i-1][j]);
            }
        }
        return p[p.length-1][p[0].length-1];
    }
}