class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int st = 0;
        int end = n * m - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            int row = mid / m;
            int col = mid % m;
            if(target == matrix[row][col]) return true;
            else if(target < matrix[row][col]) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }
}
