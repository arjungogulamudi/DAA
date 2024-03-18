import java.util.*;
public class MinMaxDivideConquer {

    static class Pair {
        int min;
        int max;

        Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public static Pair findMinMax(int[] arr, int start, int end) {
        if (start == end) {
            return new Pair(arr[start], arr[start]);
        }

        if (end - start == 1) {
            int minVal = Math.min(arr[start], arr[end]);
            int maxVal = Math.max(arr[start], arr[end]);
            return new Pair(minVal, maxVal);
        }

        int mid = (start + end) / 2;

        Pair leftPair = findMinMax(arr, start, mid);
        Pair rightPair = findMinMax(arr, mid + 1, end);

        int overallMin = Math.min(leftPair.min, rightPair.min);
        int overallMax = Math.max(leftPair.max, rightPair.max);

        return new Pair(overallMin, overallMax);
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 2, 7, 4, 6};

        Pair result = findMinMax(arr, 0, arr.length - 1);

        System.out.println("Minimum element: " + result.min);
        System.out.println("Maximum element: " + result.max);
    }
}
