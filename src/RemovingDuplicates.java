/**
 * @author codervarun
 */
class RemovingDuplicates {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int n = nums.length;
        if(n ==0){
            return count;
        }
        int prev = nums[0];
        count =1;
        int i=1;
        while(i<n){
            if(nums[i] == prev){
                //do nothing
                nums[i] = Integer.MIN_VALUE;
            }else{
                prev = nums[i];
                count++;
            }
            i++;
        }
         i=0;
        int j=0;
        while(i<n && j<= (count)){
            while(j <= (count) && nums[j]!= Integer.MIN_VALUE ){
                j++;
            }

            if(i ==0){
                i=j;
            }
            while(i<n && nums[i]==Integer.MIN_VALUE){
                i++;
            }
            if(i<n && j<= (count)) {
                //swap
                nums[j] = nums[i];
                nums[i] = Integer.MIN_VALUE;
            }
        }

//        for(i =0; i<n; i++){
//            System.out.println(nums[i]);
//        }

        return count;
    }
}