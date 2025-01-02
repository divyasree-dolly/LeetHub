class Solution {
    public int strStr(String haystack, String needle) 
    {
        int n1 = haystack.length();
        int n2 = needle.length();

        if(n2> n1)  return -1;
        if(n2==0) return 0;
        if(haystack.equals(needle)) return 0;
        if(haystack == null || needle == null) return -1;
        for(int i = 0; i<= n1-n2; i++)
        {
            int j;
            for( j=0 ; j<n2; j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
            }
            if(j==n2)
            {
                return i;
            }  
        }

        return -1;
        
    }
}