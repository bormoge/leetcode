class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int[] solution = {0, 0};

        int i = 0;

        while(i < nums.length-1)
        {
            solution[0] = i;

            solution[1] = IntStream.range(0, nums.length)
            .filter(a -> (nums[a] == (target - nums[solution[0]])) && a != solution[0])
            .findFirst()
            .orElse(-1);

            if (solution[1] != -1 && nums[solution[0]] + nums[solution[1]] == target)
            {
                break;
            }

            i += 1;
        }

        return solution;
    }
}
