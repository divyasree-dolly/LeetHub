class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        // sort the array -> O(nlogn) and store in temp array
        int n = nums.length;
        int temp[] = nums.clone();
        Arrays.sort(temp);
        //add value,index of array as key,value pairs in a map
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for( int i=0; i<n ;i++)
        {
            if(!(hm.containsKey(temp[i])))
            {
                hm.put(temp[i], i);
            }
        }
        // add the values to result array
        int result[] = new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=(int)hm.get(nums[i]);
        }
        return result;
    }
}