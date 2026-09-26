class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length-1;

        while (i <= j){
            int mid = i + (j-i)/2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[i].length-1]){
                i = 0;
                j = matrix[mid].length;
                while (i <= j){
                    int middle = i + (j-i)/2;
                    if (matrix[mid][middle] == target){return true;}
                    else if (target < matrix[mid][middle]){j = middle-1;}
                    else{i = middle+1;}
                }
            }
            else if (target < matrix[mid][0]){j = mid-1;}
            else{i = mid+1;}
        }
        return false;
    }
}
