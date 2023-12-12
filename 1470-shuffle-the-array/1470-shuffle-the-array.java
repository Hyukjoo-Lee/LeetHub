class Solution {
    public int[] shuffle(int[] nums, int n) {
        /**
            reform the array 
            => 
            n = 3
            [x1,x2,x3,y1,y2,y3]
            [x1,y1,x2,y2,x3,y3]
            [2,5,1,3,4,7] 
            [2,3,5,4,1,7]
                i
                  j

            nums[0], nums[3], nums[1], nums[4], nums[2], nums[5]

            answer[0] = nums[0]
            answer[2] = nums[1]
            answer[4] = nums[2]

            answer[1] = nums[3]
            answer[3] = nums[4]
            answer[5] = nums[5]


         */
         int[] answer = new int[nums.length];
         int j = 0;
         /**
            j = 1
            n = 4
            i == 0, nums[0] = nums[0] 
            i == 1, nums[1] = nums[3]
            i == 2, nums[1]
         
          */
          
         for(int i = 0; i < nums.length; i++) {
             if(i % 2 == 0) { 
                 answer[i] = nums[j++]; // nums[0] = nums[0], nums[2] = nums[1], nums[4] = nums[2]
             } else {
                 answer[i] = nums[n++]; // nums[1] = nums[3] nums[3] = nums[4] nums[5] = nums[5]
             }
         }

         return answer;
    }
}