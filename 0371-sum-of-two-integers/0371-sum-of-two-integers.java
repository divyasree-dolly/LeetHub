class Solution {
    public int getSum(int a, int b) 
    {
        while(b!=0)
        {
            int add = a^b;
            int carry = (a & b) << 1;

            a = add;
            b = carry;
        }  
        return a;
    }
}