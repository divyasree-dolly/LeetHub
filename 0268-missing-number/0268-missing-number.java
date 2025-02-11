class Solution {
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        int arrSum=sum(0,n,nums);
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum-arrSum;
        
    }

    public int sum(int start, int end, int[] arr)
    {
        int sum=0;
        for(int i=start; i<end;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}