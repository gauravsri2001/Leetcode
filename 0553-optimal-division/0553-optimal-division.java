class Solution {
    public String optimalDivision(int[] nums) {
        		String s="";
        int n=nums.length;
		
        if(n==1){
            return s+nums[0];
        }
        else if(n==2){
            s=s+nums[0]+ "/" +nums[1];
            return s;
        }
		
        for(int i=0;i<n;i++){
            if(i==0){
                s=s+nums[i];
                s=s+"/";
                s=s+"(";
            }
            else if(i==(n-1)){
                s=s+nums[i];
            }
            else{
                s=s+nums[i];
                s=s+"/";
            }
        }
        s=s+")";
        return s;
    }
}