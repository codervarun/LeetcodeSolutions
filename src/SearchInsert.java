public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        if (nums.length==0) return 0;
     int index = modifiedBinarySearch(nums,target);
     return index;
    }

    private int modifiedBinarySearch(int[] nums, int target) {
        int n = nums.length;
        int l =0,h =n-1;
        int mid = 0;
        while(l<h){
            mid =(l+h)/2 ;

            if (nums[mid]==target){
                return mid;
            }else if (nums[mid] > target){
                h = mid-1;
            }else if (nums[mid] < target){
                l = mid+1;
            }

        }
        if(l==h){
            mid =l+1;
        }

        return mid;
    }
}
