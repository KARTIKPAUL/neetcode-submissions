class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      int n = nums.length;

      for(int i = 0 ; i< n ; i++){
            int val = nums[i];
            if(set.contains(val)) return true;
            set.add(val);
      }
      return false;
    }
}