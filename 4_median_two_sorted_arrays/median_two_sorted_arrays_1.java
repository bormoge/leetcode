// Tried to skip the merging of arrays; did not work out.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int index1 = 0;
        int index2 = 0;
        boolean module1Flag = false;
        boolean module2Flag = false;
        
        
        if((nums1.length) % 2 == 0)
        {
            index1 = ((nums1.length) / 2) - 1;
            module1Flag = true;
        }
        else
        {
            index1 = (int)(((nums1.length) / 2) + 0.5);
        }

        if((nums2.length) % 2 == 0)
        {
            index2 = ((nums2.length) / 2) - 1;
            module2Flag = true;
        }
        else
        {
            index2 =(int)(((nums2.length) / 2) + 0.5);
        }
        
        
        if (module1Flag && module2Flag)
            result = (nums1[index1] + nums1[index1 + 1] + nums2[index2] + nums2[index2 + 1]) / 4;
        else if (module1Flag && !module2Flag)
            result = (nums1[index1] + nums1[index1 + 1] + nums2[index2]) / 3;
        else if (!module1Flag && module2Flag)
            result = (nums1[index1] + nums2[index2] + nums2[index2 + 1]) / 3;
        else if (!module1Flag && !module2Flag)
            result = (nums1[index1] + nums2[index2]) / 2;
            
        System.out.println(result);
        
        return result;
    }
}
