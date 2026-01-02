package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// 트리탐색 + 재귀적 호출을 통한 힙정렬
// 정렬이
public class A01HeapSort구현 {
    public static void main(String[] args) {
        int[] arr ={7,6,5,8,3,5,9,1,6};
        // 1. 최초힙구성
        for (int i = arr.length/2-1; i>=0; i--){
            heapify(arr,i, arr.length);
            System.out.println(Arrays.toString(arr));
        }
        // 1.1) 부모노드(n/2)와 자식노드(n/2) 분리하여 부모노드를 대상으로 heapify
        // 1.2) 자식노드의 왼쪽노드는 부모노드x2 +1, 자식노드의 오른쪽 노드는 부모노드x2 + 2
        // 1.3) heapify의 과정이 재귀호출로 이루어짐
        for(int i=arr.length/2 -1; i>=0; i--){
            heapify(arr, i, arr.length);
            // 최초힙 결과 : 1 3 5 6 7 5 9 8 6
//            System.out.println(Arrays.toString(arr));
        }
        // 2. 루트노드와 최하위노드를 자리change하면서 재heapify
        for (int i = arr.length - 1; i> 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

        }
        // 2.1) 자리change한 마지막노드는 heafipy대상에서 제외


        // 2.2) 최소힙 -> 내림차순 정렬, 최대힙 -> 오름차순 정렬
//        for(int i =arr.length - 1; i > 0; i--){
//
//            int temp = arr[0];
//            arr[0] = arr[i]; // 마지막 자리값 감소
//            arr[0] = temp;
//            heapify(arr, 0, i); // 전체길이 감소
//        }

        // pq를 통한 정렬방법
        // pq를 가지고 직접 정렬을 수행하기 보다는 지속적으로 값을 add하고 poll해나가는 상황에서 사용
        // 최초 힙구성 : n*log(n)
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList(7,6,5,1,3,5,9,8,6));
        System.out.println(pq);
        System.out.println(pq.poll()); // poll의 복잡도 = log(n)
        pq.add(2); //add의 복잡도 log(n)

    }

    static void heapify(int[] arr, int parentIndex, int Length ){
        // 자식노드와의 비교가 이루어짐, 만약 자식노드가 더작으면 자리 change
        int leftIndex = parentIndex*2 +1;
        int rightIndex = parentIndex*2 +2;
        int smallIndex = parentIndex;
        // 가장 작은 index값 찾기
        if(leftIndex< Length && arr[leftIndex] < arr[smallIndex]){
                smallIndex = leftIndex;
        }
        if(rightIndex< Length && arr[rightIndex] < arr[smallIndex]){
            smallIndex = rightIndex;
        }

        // 가장 작은 index가 부모노드가 아니라면 자리 change 및 heapify
        if(parentIndex != smallIndex){
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[smallIndex];
            arr[smallIndex] = temp;
            heapify(arr, smallIndex, Length );
        }
    }
}
