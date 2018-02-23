public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {

        if (nums==null || nums.length==0){
            return 0;
        }

        int [] len = new int[nums.length];
        for (int i = 0; i <len.length ; i++) {
            len[i]=1;
        }

        for (int i = 0; i <nums.length ; i++) {
            int lenmax = 0;

            for(int j=0; j<i; j++){

                if (nums[i] > nums[j]){
                    if(lenmax < len[j]){
                        lenmax = len[j];
                    }
                }
            }
            len[i] = lenmax +1;
        }

        int maxLIS =0;

        for (int l:len
             ) {
            if(l>maxLIS){
                maxLIS =l;
            }
        }

        return maxLIS;

    }

    public static void main(String[] args){

       // int arr[] = {10,9,2,5,3,7,101,18};
        int arr[] = {-2,-1};
        lengthOfLIS(arr);
    }
}
