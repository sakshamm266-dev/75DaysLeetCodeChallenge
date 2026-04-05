class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rw=0;
        int cl=matrix[0].length-1;
        while(rw<matrix.length && cl>=0){
            if(matrix[rw][cl]==target)
             return true;
            else if(target<matrix[rw][cl])
             cl--;
            else
             rw++;
        }
        return false;
    }
}