package search;

import java.util.List;

public class LeetCode {
    public static void main(String[] args) {

//        int[][] image = {
//                {1,1,0},
//                {1,0,1},
//                {0,0,0}
//        };
//        System.out.println(Arrays.deepToString(image));
//        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[] row : indices) {
            increment(matrix[row[0]]);
            increment(matrix[row[1]]);
        }
        return result(matrix);
    }
    private static void increment(int[] matrix) {
        for(int val : matrix) {
            val++;
        }
    }


    private static int result(int[][] matrix) {
        int result = 0;
        for(int[] row : matrix) {
            for(int col : row)     {
                if ((col % 2) != 0) result++;
            }
        }
        return result;
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for(int[] prop : image) {
            for(int i=0, j = prop.length-1; i<=j; i++,j--) {
                if (i != j) {
                    int temp = prop[i];
                    prop[i] = prop[j];
                    prop[j] = temp;
                    prop[i] = prop[i] == 0 ? 1 : 0;
                }
                prop[j] = prop[j] == 0 ? 1 : 0;
            }
        }
        return image;
    }

        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

            return switch (ruleKey) {
                case "type" -> countOccurance(items, 0, ruleValue);
                case "color" -> countOccurance(items, 1, ruleValue);
                case "name" -> countOccurance(items, 2, ruleValue);
                default -> 0;
            };
        }
        int countOccurance(List<List<String>> items, int index,  String ruleValue) {
            int count = 0;
            for(List<String> item : items) {

                if (item.get(index).equals(ruleValue))
                    count++;
                else count++;
            }
            return count;
        }
}
