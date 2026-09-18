class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int value = nums[i];
            if(map.containsKey(target - value)){
                int val = map.get(target - value);
                ans[0] = val;
                ans[1] = i;
                return ans;
            }
            else map.put(value,i);
        }
        return ans;
    }
}
