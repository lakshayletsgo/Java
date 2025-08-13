public class Top150_105 {
        int ans=0;
        public int totalNQueens(int n) {
            boolean[][]queens = new boolean[n][n];
            recursive(queens,n,0);
            return ans;
        }
        private void recursive(boolean[][]queens,int n,int count){
            if(n==count){
                ans++;
                return ;
            }
            for(int i=0;i<n;i++){
                if(hasQueenInSame(queens,count,i,n)){
                    queens[count][i] = true;
                    recursive(queens,n,count+1);
                    queens[count][i]=false;
                }
            }
        }

        private boolean hasQueenInSame(boolean[][]queens,int i, int j,int n){
            for(int k=i-1;k>=0;k--)if(queens[k][j])return false;
            for(int k=i-1,m=j-1;k>=0&&m>=0;k--,m--)if(queens[k][m])return false;
            for(int k=i-1,m=j+1;k>=0&&m<n;k--,m++)if(queens[k][m])return false;
            return true;
        }

}
