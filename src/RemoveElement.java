/**
 * @author codervarun
 */
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int n = nums.length;
        if(n ==0){
            return count;
        }
        count =0;
        int i=0;
        while(i<n){
            if(nums[i] == val ){
                nums[i] = Integer.MIN_VALUE;
                //do nothing
            }else{
                count++;
            }
            i++;
        }
        if(count ==n){
            return count;
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