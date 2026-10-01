class Solution {
    public int binarySearch(int nums[] , int target , int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) left = mid + 1;
            else right = mid - 1; 
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[right] > nums[mid]) right = mid;
            else left = mid + 1;
        }

        int pivot = left;
        int result = binarySearch(nums,target,0,pivot-1);
        if(result != -1) return result;
        return binarySearch(nums,target,pivot,n-1);

    }
}
