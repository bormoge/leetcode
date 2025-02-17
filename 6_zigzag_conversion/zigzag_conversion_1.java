class Solution {
    public String convert(String s, int numRows) {
        
        // It's the same string, be it horizontally or vertically
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        
        // ArrayList that represents the rows and its contents
        ArrayList<StringBuilder> rows = new ArrayList<>();
        
        // Initialize each row
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        
        int currentRow = 0;
        boolean changeDirection = false;
        
        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);
            
            // Change direction when it reaches top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                changeDirection = !changeDirection;
            }
            
            // Move one row each iteration
            currentRow += changeDirection ? 1 : -1;
        }
        
        String result = "";

        for (StringBuilder individualRow : rows) {
            result = result + individualRow.toString();
        }
        
        return result;
    }
}
