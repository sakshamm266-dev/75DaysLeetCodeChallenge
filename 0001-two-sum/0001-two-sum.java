class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length; //for length of array
        int sum=0,count=0;
        int indexes[]=new int[2];
        for(int i=0;i<len;i++){
            sum=0;
            for(int j=i+1;j<len;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    indexes[count]=i;
                    count++;
                    indexes[count]=j;
                    count++;
                }
            }
        }
        return(indexes);
    }
}