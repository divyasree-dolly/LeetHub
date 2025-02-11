class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        int n=nums.length;
        List list = new ArrayList();
        //changing the orignal array if the number at it's position exists to -ve
        for(int i=0;i<n;i++)
        {
            int ind = Math.abs(nums[i]);
            if(nums[ind-1]>0)
            {
                nums[ind-1]*=-1;
            }
        }   

        //adding non -ve values to the list
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                list.add(i+1);
            }
            
        }

        return list;
    }
}