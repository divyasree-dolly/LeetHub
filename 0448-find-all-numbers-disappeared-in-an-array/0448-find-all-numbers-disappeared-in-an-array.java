class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Set set = new HashSet();
        int n=nums.length;
        List list = new ArrayList();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }   
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }

        return list;
    }
}