public class MinSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {

        int n = nums.length;
        int minlen =n;
        int j=0;
        int i=0;
        int sum =0;

       while(sum <s && i<n){
           sum +=nums[i++];
       }
        minlen = i;

        while(i< n){
            while(sum >= s && j <n){
                sum -=nums[j++];
                if(sum >=s){
                    int len = j>0?i-j: i-j-1;
                    if(len < minlen){
                        minlen =len;
                    }
                }
            }
            while(sum <=s && i<n){
                sum +=nums[i++];
            }

            if(sum >=s) {
                int len = j>0?i-j: i-j-1;
                if (len < minlen) {
                    minlen = len;
                }
            }

        }
        return minlen;
    }

}
