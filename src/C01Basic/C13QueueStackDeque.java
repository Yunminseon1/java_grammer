package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C13QueueStackDeque {
    static void main(String[] args) {
          // Queue인터페이스를 LinkedList를 구현한 아래와 같은 방식으로 가장 많이 사용
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//
//        // poll은 queue에서 가장 앞의 데이터를 삭제하는 동시에 return하는 메서드
//        int value = myQue.poll();
//        System.out.println(value); // 10
//        System.out.println(myQue); // 20 30
//
//        // peek은 queue에서 데이터를 삭제하지 않고 가장 앞의 데이터를 return하는 메서드
//        int value2 = myQue.peek();
//        System.out.println(value2); // 20
//        System.out.println(myQue); // 20 30

//        while문을 통한 queue 출력방식
//        Queue<String> printerQueue = new LinkedList<>();
//        printerQueue.add("문서1");
//        printerQueue.add("문서2");
//        printerQueue.add("문서3");
//        printerQueue.add("문서4");

//        큐는 일반적으로 while문을 통해 요소를 소모
//        int size = printerQueue.size();
//        for (int i=0; i<size; i++){
//            System.out.println(printerQueue.poll());
//        }

//
//        while(!printerQueue.isEmpty()){
//            System.out.println(printerQueue.poll());
//        }

//        LinkedList와 ArrayList의 성능차이 비교
//        ArrayList의 장점 : 조회성능빠름, 단점 : 중간 삽입/중간 삭제 성능 저하
//        LinkedList의 장점 : 중간 삽입/삭제 성능 빠름, 단점 : 조화 성능 저하
//        구하는 방법
//        시작 시간구하고
//        끝나는 시간 - 현재시간



          // LinkedList
//        LinkedList<Integer> myLinkedList = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//            myLinkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList에 중간에 값 add시에 소요시간 " + (endTime - startTime));
//
//        // ArrayList
//        ArrayList<Integer> myArrayList = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//
//            myLinkedList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList에 중간에 값 add시에 소요시간 " + (endTime2 - startTime2));

//        관련문제 : 카드2
//        1번째 시도
        // 정수 입력
//        Scanner sc = new Scanner(System.in);
//        // 카드 번호 출력
//        System.out.println();

//        정답코드
//        Scanner sc = new Scanner(System.in); // 스캐너 함수
//        int N = sc.nextInt(); // nextInt() 정수형 입력 받을때 사용하는 메서드
//
//        Queue<Integer> queue = new LinkedList<>(); // int 형 queue 선언
//
//        // 1. 카드 넣기
//        for(int i = 1; i<=N; i++){
//            queue.add(i);
//        }
//
//        // 2. 카드가 1장 남을 때까지 반복
//        while (queue.size()>1){
//            queue.poll();
//            queue.add(queue.poll());
//        }
//
//        // 3. 결과 출력
//        System.out.println(queue.poll());

//         요세푸스 문제 0
//        첫번째 풀이

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        Queue<Integer> queue = new LinkedList<>();
//        System.out.println();




//        길이제한큐
//          Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); // 길이 초과시 에러발생

//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4"); // 제한된 길이 까지만 add. 에러발생 x
//        System.out.println(blockingQueue);

//        우선순위큐 : 데이터를 poll 할때 정렬된 데이터결과값(최소값/최대값) 보장
//        지속적으로 데이터가 추가/제거 되면서 전체 데이터가 실시간으로 변경되는 상황에 사용
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
////            poll 할때마다 최소값을 추출하게되고, 복잡도 log(n). peek은 최소값을 확인만 하고 추출X, 복잡도 log(n)
////            전체데이터를 모두 poll하면 복잡도 n*log(n)
//            System.out.println(pq.poll());
//        }


//         1927번 최소힙
        // 1번째 시도
        // 비어있는 배열 선언
        //자연수 X 넣기
        // 최소값 출력 하고 그값 배열에서 제거
//        int [] x; // int [] x = new int[10]; 이게 올바른 배열 선언
//        Scanner sc = new Scanner();
//        System.out.println(x.min);

        // 2번째 시도
//        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 힙 가져오기
//        Scanner sc = new Scanner(System.in); // 자연수 x를 입력받을 스캐너
//
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        // 최소 힙
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        for (int i =0; i<N; i++){
//            int x = sc.nextInt();
//
//            if (x == 0){
//                if(pq.isEmpty()){
//                    System.out.println(0);
//                }else{
//                    System
//                }
//            }
//        }







//        프로그래머스 : 더 맵게

//        최대힙 : poll 할때마다 최대값을 추출
//        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

//        stack : 후입선출의 자료구조
//        Stack<String> myStack = new Stack<>();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//        System.out.println(myStack.pop()); // 가장마지막에 입력한 값을 꺼내는 것
//        System.out.println(myStack.peek()); // 마지막에 입력한 값을 확인만
//        System.out.println(myStack.size());
//        System.out.println(myStack.isEmpty());

//        프로그래머스 : 올바른 괄호
//        여는 괄호를 저장할 스택 초기화
//        Stack<Character> stack = new Stack<>();
//        // 문자열의 각 문자를 순회
//        for (int i = 0; i<s.length(); i++){
//            char c = s.charAt(i);
//
//            // 여는 괄호를 만나면 스택에 추가
//            if (c == '('){
//                stack.push(c);
//            }
//            // 닫는 괄호를 만나면 스택에서 여는 괄호를 제거
//            else if (c == ')') {
//                // 스택이 비어 있으면 짝이 맞지 않음
//                if(stack.isEmpty()){
//                    return false;
//                }
//                stack.pop(); // 가장 최근의 여는 괄호 제거
//
//            }
//        }
//        // 모든 괄호의 짝이 맞는지 확인
//        return stack.isEmpty();

//        프로그래머스 : 같은 숫자는 싫어
//        ArrayList<Integer> list = new ArrayList<>();
//        // 배열 arr 선언
//
//        // 첫번째 값은 무조건추가
//        list.add(arr[0]);
//        // ArrayList -> int []
//        int[] answer = new int[list.size()];
//        for (int i = 0; i < list.size(); i++){
//            answer[i] = list.get(i);
//        }
//        return answer;

//        프로그래머스 : 같은 숫자는 싫어 스택 풀이
//        import java.util.*;
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(arr[0]);
//
//        for (int i = 1; i<arr.length; i++){
//            if(arr[i] != arr[i-1]){
//                list.add(arr[i]);
//            }
//        }
//
//        Stack<Integer> list = new Stack<>();
//
//        list.add(arr[0]);
//
//        for (int i = 1; i < arr.length; i++){
//            if(arr[i] != arr[i-1]){
//                list.add(arr[i]);
//            }
//        }

//        deque : addFirst, addLast, pollFirst, pollLast, peekFirst, peekLast
//          Deque<Integer> myDeque = new ArrayDeque<>();
//          myDeque.addLast(10);
//          myDeque.addLast(20);
//          myDeque.addFirst(30); // 30 -> 20 -> 10 순서

//          System.out.println(myDeque.pollLast()); // 20
//          System.out.println(myDeque.pollFirst()); // 30
//          System.out.println(myDeque.pollFirst()); // 30
    }
}
