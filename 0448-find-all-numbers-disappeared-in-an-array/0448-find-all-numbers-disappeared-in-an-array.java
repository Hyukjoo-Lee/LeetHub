class Solution {
    /**
        follow up question - Space O(1), Time O(N)
        ArrayList 
        nums = [-1,-3,-2,2,1]
        => [4,5]
            
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // add all numbers into set
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums) {
            set.add(num);
        }

        for(int i = 1; i < nums.length + 1; i++) {
            if(!set.contains(i)) {
                list.add(i);
            }
        }
        
        return list;
    }
}
