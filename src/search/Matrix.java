package search;

public class Matrix {
    public static void main(String[] args) {

    }
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        return m==n ? squareMatrix(matrix, m, n) : notSqaureMatrix(matrix, m, n);
    }

    private static int[][] squareMatrix(int[][] matrix, int m, int n) {
        for(int i = 0; i< m; i++) {
            for(int j = i+1; j< n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }


    private static int[][] notSqaureMatrix(int[][] matrix, int m, int n) {
        int[][] result = new int[n][m];

        for(int i = 0; i< m; i++) {
            for(int j = 0; j< n; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
