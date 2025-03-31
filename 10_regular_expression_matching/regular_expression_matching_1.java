class Solution {
    public boolean isMatch(String s, String p) 
    {
        if (p == null || p.length() == 0)
        {
            return (s == null || s.length() == 0);
        }
        
        boolean matrix[][] = new boolean[s.length()+1][p.length()+1];
        
        matrix[0][0] = true;

        for (int j=2; j<=p.length(); j++)
        {
            matrix[0][j] = p.charAt(j-1) == '*' && matrix[0][j-2]; 
        }
        
        for (int j=1; j<=p.length(); j++) 
        {
            for (int i=1; i<=s.length(); i++)
            {
                if (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '.')
                {
					matrix[i][j] = matrix[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*')
                {
                    matrix[i][j] = matrix[i][j-2] || ((s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && matrix[i-1][j]); 
                }
            }
        }
        
        return matrix[s.length()][p.length()];        
    }
}
