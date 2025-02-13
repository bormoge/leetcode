class Solution {
    public int[] twoSum(int[] nums, int target) {
	// Map representing the original array 
	Map<Integer, Integer> numMap = new HashMap<>();

	// Length of original array
	int n = nums.length;

        for (int i = 0; i < n; i++) {
	    // Subtracting from target
	    int complement = target - nums[i];

	    // Search for the subtracted number and returning the index of the required numbers for target
	    if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i); // Putting the values of the original array on the map.
        }

        return new int[]{}; // No solution found
    }
}
