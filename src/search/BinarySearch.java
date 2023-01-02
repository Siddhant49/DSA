package search;

//import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {79,80,87};
        int target = 87;
        System.out.println(binarySearch(arr, target));
        System.out.println(agnosticOrderBS(arr, target));
    }

    private static int agnosticOrderBS(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start+end >>> 1; //prevent stackOverflow right-bit-shift operator divides by 2 to the power of right operand
            if(arr[mid]==target) return mid;
            if(isAsc) {
                if (arr[mid]<target)
                    start = mid+1;
                else
                    end = mid-1;
            }
            else {
                if (arr[mid]>target)
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+end >>> 1; //prevent stackOverflow right-bit-shift operator divides by 2 to the power of right operand
            if (arr[mid]<target) start = mid+1;
            else if (arr[mid]>target) end = mid-1;
            else return mid;
        }
        return -1;
    }
}
