class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 0) return 0;
        int ans = 1;
        int res = 1;
        for(int i = 0 ; i < n -1  ; i++){
            if(nums[i] == nums[i+1]) continue;
            else if(nums[i] + 1 == nums[i+1]){
                ans++;
                res = Math.max(res,ans);
            }
            else if(nums[i] < nums[i+1]){
                ans = 1;
                res = Math.max(res,ans);
            }
        }

        return res;
    }
}
