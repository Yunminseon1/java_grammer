package C01Basic;

import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.*;



public class C11Map {
    static String main(String[] args) {

//        map : key, value로 이루어진 자료구조
//        Map<String, Integer> sports = new HashMap<>();

////        특징 : key는 중복이 없음, value는 중복가능
//        sports.put("농구",2);
//        sports.put("축구",3);
//        sports.put("배구",2);
//        sports.put("농구",3);
//
//        특징 : map의 key에는 순서가 없다
//        System.out.println(sports);
//
////       특징 : map에서 key 값을 통한 검색 복잡도는 o(1).
//        System.out.println(sports.get("배구"));
//
//
//        map의 전체 데이터 출력
//        map의 키값 접근시에는 인덱스 사용 불가능(순서가 없음)
//        keySet() : 맵의 전체 key목록을 반환하는 메서드
//
//        for (String a: sports.keySet()){
//            System.out.println("key : " + " value : " +sports.get(a));
//        }
//

////        values() : map의 전체value목록을 반환하는 메서드 (잘안쓰임)
//        for (int a : sports.values()){
//            System.out.println(a);
//        }
//
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("축구", 2);
//        sports.put("농구", 3);
//        sports.put("배구", 2);
//
//

////        remove : key를 통해 map 요소 삭제
//        sports.remove("축구");
//        System.out.println(sports);
//
//

////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("배구", 10);
//        System.out.println(sports);
//
//

////        containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("배구"));
//        System.out.println(sports.containsKey("탁구"));
//
//
//        map을 통한 개수 count
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"}; //농구 2, 축구 1, 야구1
//        Map<String, Integer> myMap = new HashMap<>();
//
//        for (String sport : arr) {
//            myMap.put(sport, myMap.getOrDefault(sport, 0) + 1);
//        } else{
//            myMap.put(a, 1);
//        }
//    }
//
//   getOrDefault(키값, 초기값) : 키값이 있으면 있는값 리턴 없을경우 초기값 return
//
//            myMap.put(a, myMap.getOrDefault(a,0+1));
//
//        System.out.println(myMap);
//
//
//        축구:1만 남도록
//
//        String[] arr2 = {"농구", "농구","농구","야구","축구"};
//            Map<String, Integer> myMap = new HashMap<>();
//
//            for (String sport : arr2) {
//            if ((sport.equals("축구"))){
//                myMap.put("축구", myMap.getOrDefault("축구",0)+1);
//            }
//        }
//            System.out.println(myMap); // {축구=1}
//
//        String[] arr2 = {"농구", "농구","농구","야구","축구"};
//        Map<String,Integer> myMap = new HashMap<>();

////        축구 : 1만 남도록
//        for (String sport : arr2){
//            if (!sport.equals("축구")) continue;//축구만 카운트
//            myMap.put("축구", myMap.getOrDefault("축구",0)+1);
//        }
//        System.out.println(myMap);
//
//        프로그래머스 : 완주하지 못한 선수
//
//        class Solution {
//            public String solution(String[] participant, String[] completion) {
//                Map<String, Integer> map = new HashMap<>();
//
//                // 참가자 넣기
//                for (String p : participant) {
//                    map.put(p, map.getOrDefault(p, 0) + 1);
//                }
//
//                // 완주자 빼기
//                for (String c : completion) {
//                    map.put(c, map.get(c) - 1);
//                }
//
//                // 값이 1인 사람 찾기
//                for (String key : map.keySet()) {
//                    if (map.get(key) > 0) {
//                        return key;
//                    }
//                }
//
//                return "";
//            }
//        }
//
//        프로그래머스 : 의상
//
//
//        가장 value가 큰 키값 찾기
//
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("축구", 3);
//        myMap.put("농구", 2);
//        myMap.put("야구", 1);
//
//        int max = Integer.MIN_VALUE;
//        String maxKey = "";
//
//        for (String a : myMap.keySet()) {
//            int value = myMap.get(a);
//            if (max < value) {
//                max = value;
//                maxKey = a;
//            }
//        }
//        System.out.println(maxKey);
//
//

//        // 백준 : 베스트 셀러


//        // 해당 맥스value를 갖는 key를 구한다. 모두 list에 더한다. (for문)
//        List<String> list = new ArrayList<>();
//
//
//        for (String key : map.keyset()) {
//            if (map.get(key) == max) {
//                list.add(key);
//            }
//        }
//
//        // list를 정렬한다. 0번째 값 출력
//
//        Collections.sort(list);
//        System.out.println(list.get(0));
//
//        map = new HashMap<>();
//        int N = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < N; i++) {
//            String title = br.readLine();
//            map.put(title, map.getOrDefault(title, 0) + 1);
//        }
//
//        // 가장 많이 팔린 책 찾기
//        int max = 0;
//        String answer = "";
//
//        for (String key : map.keySet()) {
//            int count = map.get(key);
//
//            if (count > max) {
//                max = count;
//                answer = key;
//            } else if (count == max) {
//                // 사전순 비교
//                if (key.compareTo(answer) < 0) {
//                    answer = key;
//                }
//            }
//        }
//
//        System.out.println(answer);

        // Tree map : key를 정렬(오름차순)정렬 하여 map을 저장
//        Map<String, Integer> myMap = new TreeMap<>();
////      Map<String, Integer> myMap = new TreeMap<>();(Comparator.reverseOrder()); //내림차순
//        myMap.put("hello5", 1);
//        myMap.put("hello4", 2);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 4);
//        myMap.put("hello1", 5);
//        System.out.println(myMap);
//
//        return "";


//        백준 : 파일정리

//        LinkedHashMap : 데이터의 삽입순서 보장(입력시간순정렬)
//        Map<String, Integer> myMap = new LinkedHashMap<>();
//        myMap.put("hello5", 5);
//        myMap.put("hello4", 4);
//        myMap.put("hello3", 3);
//        myMap.put("hello2", 2);
//        myMap.put("hello1", 1);
//
//        for (String a : myMap.keySet()) {
//            System.out.println(a + "" + myMap.get(a));
//        }

//        iterator를 이용한 출력
        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("야구",2);
        myMap.put("축구",3);
        myMap.put("농구",4);
        Iterator<String> iters = myMap.keySet().iterator();

////        next 메서드는 데이터를 하나씩 소모시키면서 값을 반환한다.
        System.out.println(iters.next());
        System.out.println(iters);

////        hasNext메서드는 iterator안에 그 다음값이 있는지 없는지 boolean 리턴
//        System.out.println(iters.hasNext());
        while (iters.hasNext()){
            System.out.println(iters.next());
        }
        return "";
    }
}
