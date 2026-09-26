class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n - 1;
        int res = Integer.MIN_VALUE;
        while(i < j){
         int ans = ((j-i) * Math.min(heights[i], heights[j]));
         res = Math.max(res,ans);
         if(heights[i] <= heights[j]) i++;
         else j--;
        }
        return res;
    }
}
