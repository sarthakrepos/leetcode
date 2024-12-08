class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length-2;

        if(nums.length==1 || nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] != nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]==nums[mid+1]){
                if(mid%2==0){
                    left=mid+1;
                }
                else{
                    right = mid;
                }
                

            }
            else{
                if((mid-1)%2==0){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }

        }
        return -1;
        
    }
}