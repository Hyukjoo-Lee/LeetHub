class Solution {
    public int longestConsecutive(int[] nums) {
        /**
            [100,4,200,1,2,3]

            brute force.. more than n^2
            sort => O(logn)..

            to implement O(n), HashSet
            distinct numbers, hash (index X)
         */

        Set<Integer> set = new HashSet<Integer>();
        
        // to remove the duplicated elements 
        for(int num : nums) {
            set.add(num);
        }

        int updatedLongest = 0;
        
        for(int num : set) {
            // check if num is starting point
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentLongest = 1;

                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLongest++;
                }

                updatedLongest = Math.max(updatedLongest,currentLongest);
            }
        }

        return updatedLongest;
    }
}