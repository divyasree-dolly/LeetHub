class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }

    int backtrack(int[] nums, int xorr, int index) {
        if (index == nums.length)
            return xorr;
        int exclude = backtrack(nums, xorr, index + 1);
        int include = backtrack(nums, xorr ^ nums[index], index + 1);
        return exclude + include;
    }
}