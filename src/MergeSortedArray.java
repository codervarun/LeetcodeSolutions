public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = m + n-1;

        while(m!=0 && n!=0){
            if(nums1[m-1] > num2[n-1]){
                nums1[l--] = nums1[m-1];
                m--;
            }else{
                nums1[l--] = nums1[n-1];
                n--;
            }
        }

        while(m!=0){
            nums1[l--] = nums1[m-1];
            m--;
        }
        while(n!=0){
            nums1[l--] = nums2[n-1];
            n--;
        }

    }

}
