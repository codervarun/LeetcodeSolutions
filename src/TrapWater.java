public class TrapWater {

    public int trap(int[] height) {
      int trapwater =0;
      int n = height.length;
      int []l = new int[n];
      int []r = new int[n];
      int maxl =0;
      for(int i=0; i<n; i++){
       l[i] = maxl;
       if(height[i] > l[i]){
           maxl = height[i];
       }
      }
      int maxr=0;
        for(int i=n-1; i>=0; i--){
            r[i] = maxr;
            if(height[i] > r[i]){
                maxr = height[i];
            }

        }

     for(int i=1; i<n; i++){
          int lmax  = height[i] > l[i] ? 0 :l[i]- height[i];
          int rmax =  height[i] > r[i] ? 0 :r[i] - height[i];

          int h = Math.min(lmax, rmax);
          trapwater +=h;
     }

     return trapwater;
    }
}
