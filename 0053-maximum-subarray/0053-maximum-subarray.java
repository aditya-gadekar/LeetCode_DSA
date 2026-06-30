class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //step 1 create sum
            sum=sum+nums[i];
            //setp 2 update maxi as sum
            maxi=Math.max(maxi,sum);
            //step 3 check sum for negative vlaue
            if(sum<0){
                sum=0;
            }


        }
        return maxi;
    }
}