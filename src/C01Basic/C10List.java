package C01Basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class C10List {
    public static void main(String[] args) {

////        List 선언방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        List 선언방법2 : 가장 일반적인방법
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅방법1. 개별data를 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//        System.out.println(myList3);
//

////        초기값 세팅방법2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//
////        List의 출력
////        List등의 컬렉션 프레임워크안에는 toString메서드가 구현되어있고 자동호출되고 있다.
//        System.out.println(myList4);


////        List의 안의 자료타입으로는 기본형타입은 쓸수 없음.
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>();
//        for (int i : intArr){
//            myList5.add(i);
//        }

//    add : 리스트의 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
////        myList.add(10);
////        myList.add(20);
////        myList.add(0, 30); // List는 중간위치의 데이터를 삽입하고 삭제하는 작업은 비효율적이다.
////        System.out.println(myList);
//
//
////         get(index) = 특정 index의 요소반환
//        System.out.println(myList.get(2));
//
////        size() : 리스트의 개수(길이)를 반환
//        System.out.println(myList.size());
//
////       리스트의 값 출력 방법 1. 일반 for문
//        Scanner sc = new Scanner(System.in);
//        for (int i =0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
////        리스트의 값 출력 방법2. 향상된 for문
//
//        for (int a: myList){
//            System.out.println(a);
//        }


//        remove : 값 삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.remove(myList.size()-1);

//        indexof : 특정 값을 찾아 index를 리턴해준다(가장 먼저 나오는값)

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        myList.add(30);
//        System.out.println(myList.indexOf(30));
//
//
////        contains: 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList.contains(20));
//
////        프로그래머스 : n의 배수 고르기
//        int[] answer = new  int[myList.size()];
//        for(int i =0; i<answer.length; i++){
//            answer[i] = myList.get(i);
//        }

//        정렬 : 방법2가지(Collections 클래스의 sort 메서드 사용, 객체의 sort 메서드 사용)
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//
//        Collections.sort(myList); //오름차순
//        Collections.sort(myList, Collections.reverseOrder()); // 내림차순
//        System.out.println(myList);
//
//        myList.sort(Comparator.naturalOrder()); // 오름차순
//        myList.sort(Comparator.reverseOrder()); // 내림차순
//        System.out.println(myList);


//        이중 리스트 : 리스트안의 리스트
//        [[1,2,3],[4,5,6]]

//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> m1 = new ArrayList<>();
//
//        myList.add(m1); // [[]]
//        myList.add(new ArrayList<>());  // [[],[]]
//
//        myList.get(0).add(1);
//        myList.get(0).add(2);
//        myList.get(0).add(3);
//
//        myList.get(1).add(4);
//        myList.get(1).add(5);
//        myList.get(1).add(6);
//
//
//        System.out.println(myList);

//        [[1,2,3],[4,5,6],[7,8,9]...,[58,59,60]] 형태의 이중리스트 생성

//        List<List<Integer>> myList = new ArrayList<>();
//
//      for (int i = 0; i<20; i++){
//          myList.add(new ArrayList<>());
//      }
//      int num = 1;
//        for (int j=0; j<20; j++){
//            myList.get(i).add(num);
//            num++;
//        }

//        리스트안의 배열
//        [{10,20},{1,2,3},{4,3,2,1}]

        List<int[]> myList = new ArrayList<>();
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        myList.add(arr);
        myList.add(new int[3]);
        myList.get(1)[0]=1;
        myList.get(1)[1]=2;
        myList.get(1)[2]=3;
        myList.add(new int[]{4,3,2,1});

        System.out.println(myList); // 배열주소값이 출력.[x1배열주소, x2배열주소, x3배열주소]

        for (int i = 0; i< myList.size(); i++){
            System.out.println(Arrays.toString(myList.get(i)));
        }


    }
}


