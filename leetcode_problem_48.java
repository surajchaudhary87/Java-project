class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Calculate transpose of 2d array
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                // Swap i,j = j,i
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse every row
        for(int i = 0; i < n; i++){
            int first = 0;
            int last = n-1;

            while(first <= last){
                int temp = matrix[i][first];
                matrix[i][first] = matrix[i][last];
                matrix[i][last] = temp;

                first++;
                last--;
            }

        }
    }
}
