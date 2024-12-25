class Solution {
    public boolean canMakeSquare(char[][] grid) 
    {
        // grid 1 : 00, 01, 10, 11
        // grid 2 : 01, 02, 11, 12
        // grid 3 : 10, 11, 20, 21
        // grid 4 : 11, 12, 21, 22
        
        int W=0,B = 0;
        if(grid[1][1] == 'B') B++; // as grid[1][1] is common adding it's value here
        else W++;
        ArrayList<Character> grid1 = new ArrayList<Character>();
        grid1.add(grid[0][0]);
        grid1.add(grid[0][1]);
        grid1.add(grid[1][0]);

        ArrayList<Character> grid2 = new ArrayList<Character>();
        grid2.add(grid[0][1]);
        grid2.add(grid[0][2]);
        grid2.add(grid[1][2]);

        ArrayList<Character> grid3 = new ArrayList<Character>();
        grid3.add(grid[1][0]);
        grid3.add(grid[2][1]);
        grid3.add(grid[2][0]);

        ArrayList<Character> grid4 = new ArrayList<Character>();
        grid4.add(grid[1][2]);
        grid4.add(grid[2][1]);
        grid4.add(grid[2][2]);
        
        // Create an array of grids
        ArrayList<Character>[] grids = new ArrayList[] { grid1, grid2, grid3, grid4 };

        // Iterate over grids and check conditions
        for (ArrayList<Character> gridList : grids) {
            if (checkIfTrue(gridList, W, B)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfTrue(ArrayList<Character> grid, int W, int B)
    {
        for ( int i = 0; i< grid.size() ; i++)
        {
            if(grid.get(i)=='B') B++;
            else W++;
        }
// (W>0 || B>0) this condition works for a case where all the grids have same color like
// B B B
// B B B
// B B B

        if((W != B) && W+B == 4 && (W>0 || B>0) ) return true;
        return false;
    }
}