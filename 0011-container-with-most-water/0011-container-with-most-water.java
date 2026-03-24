class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
        int CurrWater=0,MaxWater=0;
        while(low<high){
            int ht=Math.min(height[low],height[high]);
            int wd=high-low;
            CurrWater=ht*wd;
            MaxWater=Math.max(CurrWater,MaxWater);
            if(height[low]<height[high])
             low++;
            else
             high--;
        }
        return MaxWater;
    }
}