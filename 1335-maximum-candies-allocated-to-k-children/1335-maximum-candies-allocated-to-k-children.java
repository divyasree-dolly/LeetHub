class Solution {
    public int maximumCandies(int[] candies, long k) 
    {
        int n = candies.length;
        long totalCandies =0;
        int max = candies[0];
        for(int i=0;i<n;i++)
        {
            totalCandies+=candies[i];
            max = candies[i]> max ? candies[i] : max;
        }
        if(totalCandies<k) return 0;
        int low = 1, right = max;
        int ans =0;
        while(low<=right)
        {
        int mid = low + ( right - low)/2;
        long count =0;
            for(int candy : candies)
            {
                count+= candy/mid;
            }
            if(count>=k)
            {
                ans = mid;
                low = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }

        return ans;
        
    }
}