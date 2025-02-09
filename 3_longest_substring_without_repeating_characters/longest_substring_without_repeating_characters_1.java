// For some reason it didn't work with an empty string ("").

class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        String[] arrayS = s.split("");
        ArrayList<String> repeatedList = new ArrayList<String>();
        int maxLen = 0;
        int tempLen = 0;

        int i = 0;

        while(i < arrayS.length)
        {
            if(!(repeatedList.contains(arrayS[i]))
            && !(arrayS[i] == ""))
            {
                tempLen += 1;
                repeatedList.add(arrayS[i]);
            }
            else if (repeatedList.contains(arrayS[i])
            && !(arrayS[i] == ""))
            {
                tempLen = 1;
            }
            if(tempLen >= maxLen)
            {
                maxLen = tempLen;
            }
            i++;
        }

        return maxLen;
    }
}
