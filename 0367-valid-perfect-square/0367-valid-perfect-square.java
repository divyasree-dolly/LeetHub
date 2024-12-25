class Solution {
    public boolean isPerfectSquare(int N) 
    {
        if( N==1)
            return true;
        for(int i=1 ; i<N; i++)
        {
            if(i*i == N)
            {
                return true;
            }
            else if(i*i > N)
            {
                return false;
            }
        }
        return false;
        
    }
}