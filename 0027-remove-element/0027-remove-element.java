class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int n=nums.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val){
                count++;
            }
        }
        if(n==count) return 0;
        // System.out.println(count);
        for(int i=0,j=n-1;i<n && j>=n-count && i<j ;)
        {
            if(nums[j]==val)
            {
                j--;
            }
            if(nums[i]==val && nums[j]!=val)
            {
                nums[i]=nums[j];
                nums[j]=val;
                j--;
                i++;
            }
            if(nums[i]!=val)
            {
                i++;
            }
        }
        return n-count;
        
    }
}