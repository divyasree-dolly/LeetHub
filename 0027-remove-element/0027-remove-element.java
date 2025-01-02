class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int n=nums.length;
        int count =0;
        //1. finding the no. of occurances of val in nums[]
        //2. pushing them to the end of array
        //finding the value count in nums[]
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val){
                count++;
            }
        }
        if(n==count) return 0;
        // System.out.println(count);
        //looping from i=0 to n and j=n-1 to count times
        for(int i=0,j=n-1;i<n && j>=n-count && i<j ;)
        {
            //skip to swap if last elem is already the val
            if(nums[j]==val)
            {
                j--;
            }
            //swap if i==val from start and j!==value from end
            if(nums[i]==val && nums[j]!=val)
            {
                nums[i]=nums[j];
                nums[j]=val;
                j--;
                i++;
            }
            //no need to swap if first elements ain't the value so continue forward
            if(nums[i]!=val)
            {
                i++;
            }
        }
        return n-count;
        
    }
}