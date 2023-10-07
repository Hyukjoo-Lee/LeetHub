class Solution {
    /**
        follow up question - Space O(1), Time O(N)
        ArrayList 
        nums = [-1,-3,-2,2,1]
        => [4,5]
            
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] digits = new int[nums.length + 1];

        for(int num : nums) {
            digits[num] = num;
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < digits.length; i++) {
            if(digits[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
