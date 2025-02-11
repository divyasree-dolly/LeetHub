class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int n = nums.length;
        int result[] = new int[2];
        for(int i=0;i<n;i++)
        {
            int search = target - nums[i];
            if(mp.containsKey(search))
            {
                int ind = mp.get(search);
                result[0]= i;
                result[1]=ind;
                // return new int[] { i, ind};
                return result;
            }
            else
            {
                mp.put(nums[i],i);
            }
        }
        return result;
    }
}