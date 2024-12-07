class Solution {

    public int firstPosition(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]>=target){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return ans;
    }

    public int lastPosition(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]>target){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstIndex=firstPosition(nums, target);
        if(firstIndex == nums.length || nums[firstIndex]!= target){
            return new int[] {-1,-1};
        }
        int lastIndex=lastPosition(nums, target);
        return new int[] {firstIndex, lastIndex-1};
    }
}