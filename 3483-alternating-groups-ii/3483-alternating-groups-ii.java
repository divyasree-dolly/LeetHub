class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) 
    {
        int n= colors.length;
        //extend the array for one more window size to make it a cyclic
        int temp[] = new int[n+k-1];
        //System.arraycopy(src, src_pos, dest, desT_pos, len);
        System.arraycopy(colors, 0, temp, 0, n);
        System.arraycopy(colors, 0, temp, n, k-1);
        int left =0, count =0;
        //sliding window approach... 
        for(int right = 0; right<temp.length;right++)
        {
            //if 2 consecutive elements are same, reset let = right, break the alternating group
            if(right>0 && temp[right]==temp[right-1])
            {
                left=right;
            }
            // whenever size reaches at least k, count a valid grpup
            if(right-left+1>=k)
            {
                count++;
            }
        }
        return count;
        
    }
}