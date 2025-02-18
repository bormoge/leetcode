class Solution {
    public int reverse(int x) {
        long sign = 1;

        if(x < 0)
        {
            //Convert to positive, store negative symbol
            x = -x; 
            sign = -1;
        }

        long reversed = 0;
        
        while(x != 0)
        {
            // Make place to next digit
            reversed = reversed * 10;

            // Put digit on the reverse variable
            reversed += x % 10;

            // We passed digit to reverse variable; we continue with the next digit
            x = x / 10;
        }
        
        // Can't go past MAX_VALUE or MIN_VALUE
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        
        // If necessary convert to negative
        return (int) (sign * reversed);
    }
}
