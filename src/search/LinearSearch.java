package search;

import java.util.Arrays;
// https://leetcode.com/problems/richest-customer-wealth/
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {0,6,4},
                {12 ,56,43,55},
                {22, 11, 0}
        };
        int target = 55;
        System.out.println(Arrays.toString(getIndexOf(target, arr)));

    }

    private static int[] getIndexOf(int target, int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == target)
                    return new int[]{i, j};
        return null;
    }
}
