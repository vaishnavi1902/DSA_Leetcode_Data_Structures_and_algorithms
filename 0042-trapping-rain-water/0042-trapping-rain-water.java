class Solution {
    public int trap(int[] height) {
        // calculate array for left max elements
        int lmax[] = new int[height.length];
        lmax[0] = height[0];
        for(int i = 1 ; i < height.length ; i++){
            lmax[i] = Math.max(lmax[i-1],height[i]);
        }

        // calculate array for right max elements
        int rmax[] = new int[height.length];
        rmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2 ; i >= 0 ; i--){
            rmax[i] = Math.max(rmax[i+1],height[i]);
        }

        // calculate the total water 
        int tw = 0;
        for(int i = 0; i < height.length; i++){
            int wl = Math.min(lmax[i],rmax[i]);
            tw += wl - height[i];
            // tw = tw + wl - height[i];
        }
        return tw;
    }
}