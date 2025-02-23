class Solution {
    public int myAtoi(String s) {
        
        s = s.trim();
        
        if (s.isEmpty()) {
            return 0;
        }

        int result = 0;
        int i = 0;


        boolean negative = s.charAt(0) == '-';
        boolean positive = s.charAt(0) == '+';

        if (negative || positive) {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) 
        {
            int digit = s.charAt(i) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
            {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        return negative ? -result : result;
    }
}
