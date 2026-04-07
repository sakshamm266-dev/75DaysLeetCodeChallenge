class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int centre=(low+high)/2;
            if(nums[centre]==target)
              return centre;
            else if(nums[low]<=nums[centre]){
                if(target>=nums[low] && target<=nums[centre])
                    high=centre;
                else
                    low=centre+1;
            }
            else{
                if(target>=nums[centre+1] && target<=nums[high])
                   low=centre+1;
                else
                    high=centre;
            }            
        }
    return(-1);
    }
}