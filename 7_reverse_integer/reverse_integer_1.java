// Doesn't work if you pass 0 as argument. Probably doesn't work if the number begins with 0.

class Solution {
    public int reverse(int x) 
    {
        String reversedNumber = "";
        
        if(String.valueOf(x).charAt(0) == '-')
        {
            reversedNumber = reversedNumber + "-";
            x = -x;
        }
        
        while (x > 0)
        {
            reversedNumber = reversedNumber + String.valueOf(x % 10);
            x = x / 10;
        }
        
        int result = Integer.valueOf(reversedNumber);
        
        return result;
    }
}
