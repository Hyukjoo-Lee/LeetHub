class Solution {
    public double findMaxAverage(int[] nums, int k) {
    /**
        initialize the sum (i ~ k) 
        update the new maximum average by adding the current / remove the previous one
     */
       
        double maxAverage = Integer.MIN_VALUE;
       
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAverage = Math.max(maxAverage, (double) sum / k);

        
        for (int i = k; i < nums.length; i++) {
            // add the current element and remove the previous element
            sum += nums[i] - nums[i - k]; 
            // update the new maximum average
            maxAverage = Math.max(maxAverage, (double) sum / k); 
        }

        return maxAverage;
    }
}