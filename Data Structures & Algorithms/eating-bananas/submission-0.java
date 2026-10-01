class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length-1];
        int res = right;
        while(left <= right){
            int k = (left + right) / 2;
            long totalTime = 0;
            for(int pile : piles){
                totalTime += Math.ceil((double) pile / k);
            }
            if(totalTime <= h){
                res = k;
                right = k - 1; 
            }else left = k + 1;
        }
        return res;
    }
}
