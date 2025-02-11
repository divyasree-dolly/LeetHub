class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int ind=0;
        int n = nums.length;
        Set set = new HashSet();
        if(n<=k)
        {
            while(ind<n)
            {
                set.add(nums[ind]);
                ind++;
            }
            if(set.size()!=n) return true;
            else return false;
        }

        for(int i=0;i<=k;i++)
        {
            set.add(nums[i]);
            ind = i;
            // System.out.println("set1: " +set);
        }
        if(set.size()!= (k+1)) return true;
        if(ind<n-1)
        {
            for(int i=ind+1, j=0;i<n & j<n-1-k;)
            {
                set.remove(nums[j]);
                set.add(nums[i]);
                // System.out.println("set2: " +set);
                // System.out.println("i: " +i + "j: "+j);
                i++;
                j++;
                if(set.size()!= (k+1)) return true;
                // System.out.println("set2: " +set);
            }
        }
        


        

        return false;
        
    }
}