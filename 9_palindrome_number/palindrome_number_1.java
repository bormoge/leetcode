class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int firstHalf = x;
        int secondHalf = 0;
        
        while (firstHalf > secondHalf) 
        {
            secondHalf = (secondHalf * 10) + (firstHalf % 10);
            firstHalf /= 10;
        }
        return (firstHalf == secondHalf) || (firstHalf == secondHalf / 10);
    }
}
