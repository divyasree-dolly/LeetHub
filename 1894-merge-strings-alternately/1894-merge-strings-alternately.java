class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        int a =0, b=0;
        int n1 = word1.length();
        int n2= word2.length();
        char res[]=new char[n1+n2];
        int i=0;
        while(a<n1 && b<n2)
        {
            res[i]=word1.charAt(a);
            i++;
            a++;
            res[i] = word2.charAt(b);
            i++;
            b++;
        }
        while(a<n1)
        {
            res[i]=word1.charAt(a);
            i++;
            a++;
        }
        while(b<n2)
        {
            res[i]=word2.charAt(b);
            i++;
            b++;
        }

        return new String(res);
    }
}