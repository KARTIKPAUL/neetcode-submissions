class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int n = nums.length;
        int count_zeros = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0) count_zeros++;
            else prod *= nums[i];
        }

        if(count_zeros > 1) return new int[n];

        int ans [] = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(count_zeros == 1) {
                ans[i] = (nums[i] == 0) ? prod : 0;
            }
            else ans[i] = prod/nums[i];
        }
        return ans;
    }
}  
