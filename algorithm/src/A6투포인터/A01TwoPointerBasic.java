package A6투포인터;

import java.util.*;

public class A01TwoPointerBasic {
    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 2, 4, 5, 1, 3, 6};
        int target = 10;

        // 1. 정렬
        Arrays.sort(arr); // 1 2 3 4 5 6 7 8 9

        List<int[]> result = new ArrayList<>();

        int start = 0;
        int end = arr.length - 1;

        // 2. 투 포인터
        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                result.add(new int[]{arr[start], arr[end]});
                start++;
                end--;
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }

        // 출력
        for (int[] pair : result) {
            System.out.println(Arrays.toString(pair));
        }
    }
}