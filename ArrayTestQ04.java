public class ArrayTestQ04 {
    public static void TrappedWaterLevel(int height []){
        int n = height.length;
        int leftMax [] = new int[n];
        int rightMax [] = new int[n];

        // calculate max from left and store in  leftMax
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate max from right and store in  rightMax
        rightMax [n-1] = height [n-1];
        for(int i=n-2; i>= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        } 

        // find the water level and then traped water.
        int trapWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterLevel - height[i];
        }

        System.out.println("Trapped Water Level : "+trapWater);

    }
    public static void main(String[] args) {
        int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappedWaterLevel(height);
    }
}
