class Solution {
    public int countGoodRectangles(int[][] rectangles) 
    {
        // Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int n = rectangles.length;
        int maxLen = 0;
        for( int i=0 ; i<n ; i++)
        {
            int min = rectangles[i][0]; // 5
            min = rectangles[i][1] < min ? rectangles[i][1] : min;
            maxLen = maxLen > min ? maxLen : min; 
            map.put(min, map.getOrDefault(min,0)+1); // (5,1) (3,1), (5,2) , (5,3)
        }
        return map.getOrDefault(maxLen,0); // max key is 5
        
    }
}