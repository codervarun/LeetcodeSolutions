import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayIntersectionII {

    public int[] intersect(int[] nums1, int[] nums2) {

        int n = Math.min(nums1.length, nums2.length);
        List<Integer> list = new LinkedList<>();
        int count = 0;
        if (n != 0) {
            int m = nums1.length;
            int k = nums2.length;
            int i = 0;
            int j = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            while (i < m && j < k) {

                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                    count++;
                    i++;
                    j++;
                } else if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (Integer ele : list) {
            arr[i++] = ele;
        }
        return arr;
    }
}
