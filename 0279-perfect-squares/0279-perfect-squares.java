class Solution {
    Integer memo[];
    int Ans=Integer.MAX_VALUE;
    public int numSquares(int n) {
        memo=new Integer[n+1];

        // return numSquaresRec( n);
        return numSquaresTab(n);
    }

    int  numSquaresRec(int n){
         if(n<=3)
             return n;

        if(memo[n]!=null)
        return memo[n];
        
        for(int i=1;i*i<=n;i++){
            if(i*i<=n)
              Ans=Math.min(Ans,1+numSquaresRec(n-i*i));
        }
     return memo[n]=Ans;
    }//rec / memo

    int numSquaresTab(int N){
        int dp[]=new int[N+1];

        for(int n=1;n<=N;n++){
            if(n<=3)
            {
                dp[n]=n;
                continue;
            }
           int Ans=Integer.MAX_VALUE;
            for(int i=1;i*i<=n;i++){
                if(i*i<=n)
                    Ans=Math.min(Ans,1+dp[n-i*i]);
            }
            dp[n]=Ans;
        }
        return dp[N];
    }
}