class Solution {
    public int minimumRecolors(String blocks, int k) 
    {
        //for window size k implement a window and count no of w's and keep track of min count
        int n= blocks.length();
        if(k==1)
        {
            if(blocks.indexOf('W')==-1)
                return 0;
            if(blocks.indexOf('B')==-1)
                return 1;
            else return 0;
        }
            

        int minWCount=Integer.MAX_VALUE;
        int count=0;

        for(int i=0;i<k;i++)
        {
            char c = blocks.charAt(i);
            if(c == 'W')
            {
                count++;
            }
        }
        if(minWCount>count)
        {
            minWCount = count;
            // count=0;
        }

        int i=0,j=k;
        while(j<n)
        {
            if(blocks.charAt(i)=='W')
            {
                count--;
            }
            if(blocks.charAt(j)=='W')
            {
                count++;
            }
            if(minWCount>count)
            {
                minWCount = count;
                // count=0;
            }
            j++;
            i++;
        }

        return minWCount;
    }
}