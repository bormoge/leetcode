class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;

        int num1 = 0;
        int num2 = 0;

        int total1 = nums1.length;
        int total2 = nums2.length;

        int[] mergedArrays = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();

        Arrays.sort(mergedArrays);

        int total = mergedArrays.length;

        if(total % 2 == 1)
        {
            result = (double) mergedArrays[total / 2];
        }
        else if(total % 2 == 0)
        {
            num1 = mergedArrays[(total / 2) - 1];
            num2 = mergedArrays[total / 2];
            result = ((double) num1 + (double) num2) / 2;
        }

        return result;
    }
}
