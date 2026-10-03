class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            //Step 1: Creating sum of sub array
            sum = sum + nums[i];

            //Step 2: Compaire max value and sum 
            maxSum = Math.max(maxSum, sum);

            //Step 3: If sum < 0 max value = 0
            if(sum < 0){
                sum = 0;
            }

        }

        return maxSum;

    }
}
