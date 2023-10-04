class Solution {
    /**
        cost[i] is the cost of i th step
        able to climb one or two steps at once
        what is the min cost to reach top step?

        [1,100,1,1,1,100,1,1,100,1]

        minCost = [0,0,1,2,3,4,5,6]
     */
    public int minCostClimbingStairs(int[] cost) {

        int top = cost.length + 1;

        int[] minCost = new int[top];

        // from step 2 and iterate up to the top
        for(int i = 2; i < top; i++) {
            int stepOneCost = minCost[i-1] + cost[i-1];
            int stepTwoCost = minCost[i-2] + cost[i-2];

            // to store minimum cost to reach the current step
            minCost[i] = Math.min(stepOneCost, stepTwoCost);
        }

        return minCost[minCost.length-1];
    }







    
}
