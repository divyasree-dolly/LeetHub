class Solution {
    public boolean squareIsWhite(String coordinates) 
    {
        int row = Character.getNumericValue(coordinates.charAt(1));
        if((coordinates.charAt(0) =='a') || (coordinates.charAt(0) =='c')|| (coordinates.charAt(0) =='e')|| (coordinates.charAt(0) =='g') )
        {
            if(row%2==0)
            {
                return true;
            }
            else return false;
        }
        else
        {
            if(row%2==0)
            {
                return false;
            }
            else return true;
        }  
    }
}