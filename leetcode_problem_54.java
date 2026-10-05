class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endingRow = row - 1;
        int startingCol = 0;
        int endingCol = col - 1;

        while(startRow <= endingRow && startingCol <= endingCol){
           
            // Print Starting Row -- startingCol - endingCol
            for(int i = startingCol; i <= endingCol; i++){
                result.add(matrix[startRow][i]);
            }
            // startingRow ++
            startRow++;

            // Print Ending Col   -- stringRow - endingRow
            for(int i = startRow; i <= endingRow; i++){
                result.add(matrix[i][endingCol]);
            }
            // endingCol--
            endingCol--;
           
            if(startRow <= endingRow){

                // Print Ending Row   -- endingCol - startingCol
                for(int i = endingCol; i >= startingCol; i--){
                    result.add(matrix[endingRow][i]);
                }
                // endingRow--
                endingRow--;
            }
           
            if(startingCol <= endingCol){
               
                // Print Starting Col -- endingRow - staringRow
                for(int i = endingRow; i >= startRow; i--){
                    result.add(matrix[i][startingCol]);
                }
                // staringCol++
                startingCol++;

            }
            
        }
        return result;
    }
}
