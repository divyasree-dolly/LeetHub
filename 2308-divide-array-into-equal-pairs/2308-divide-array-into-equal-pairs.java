class Solution {
    public boolean divideArray(int[] nums) 
    {
        int n = nums.length;
        Map<Integer,Integer> hm= new HashMap();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map : hm.entrySet())
        {
            if((map.getValue() % 2)!=0)
            {
                return false;
            }
            else continue;
        }
        return true;
        
    }
}