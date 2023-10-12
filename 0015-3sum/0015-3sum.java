class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
            find all the triplets 
            nums[i] + nums[j] + nums[k] == 0
            must not contain duplicate triplets

            sort nums 
            3 pointers?
            i = 0, start = i+1, end = nums.length -1
            [-4,-1,-1,0,1,2]
                i
                   s      e
            -4 -1 +2 = -3
            if sum -3 < 0, start ++
            if sum    > 0, end--
            if sum == 0, list.addAll(Arrays.asList(nums[i], nums[start], nums[end]))
                
        
         */


         // To remove duplicate triplets
         Set<List<Integer>> answer = new HashSet<>();

         Arrays.sort(nums);

         for(int i = 0; i < nums.length -2; i++) {
           int start = i +1;
           int end = nums.length -1;

           while(start < end) {
             int sum = nums[i] + nums[start] + nums[end];
             if(sum == 0) {
               answer.add(Arrays.asList(nums[i], nums[start], nums[end]));
               start++;
               end--;
             } else if(sum < 0) {
               start++;
             } else {
               end--;
             }
           }
         }

        return new ArrayList<>(answer);













    }
}