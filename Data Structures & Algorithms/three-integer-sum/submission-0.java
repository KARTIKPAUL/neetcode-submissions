class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length ;
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right){
            int target = nums[i] + nums[left] + nums[right];
            if(target == 0){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[left]);
                list.add(nums[right]);
                ans.add(list);
                left++;
                right--;
                while(left < right && nums[left] == nums[left-1]) left++;
               
            }else if(target > 0)  right--;
            else left++;
            
        }
       
        }
        
        return ans;
    }
}
