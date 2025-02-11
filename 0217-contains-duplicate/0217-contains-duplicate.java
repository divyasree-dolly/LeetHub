class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        Set set = new HashSet();
        int n =  nums.length;
        int i=0;
        while(i<n)
        {
            set.add(nums[i]);
            i++;
        }
        if(set.size() == n)
            return false;
        else return true;
        
    }
}