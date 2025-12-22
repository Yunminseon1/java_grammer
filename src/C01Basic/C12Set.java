package C01Basic;

import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class C12Set {
    static void main(String[] args) {
//        // set의 특성 : 중복x, 순서보장x, 성능0(1)
//        Set<String> myset = new HashSet<>();
//        myset.add("야구");
//        myset.add("농구");
//        myset.add("축구");
//        myset.add("배구");
//        System.out.println(myset);
//        System.out.println(myset.contains("야구")); // 복잡도 O(1)의 복잡도
//
//        // 수찾기 문제
//
//        // TreeSet : 데이터를 오름차순 정렬
//        Set<String> mySet2 = new TreeSet<>();
//        mySet2.add("야구");
//        mySet2.add("농구");
//        mySet2.add("야구");
//        mySet2.add("축구");
//        System.out.println(mySet2);
//
//
//        // 백준 : 수찾기
//        BufferedReader br = new BufferReader(new InputStreamReader((System.in)));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//        HashSet<Integer> set = new HashSet<>();
//        int[] arr = new int[N];
//
//        StringTokenizer st =new StringTokenizer(br.readLine());
//        for (int i = 0; i <N; i++){
//            set.add(Integer.parseInt((st.nextToken())));
//
//        }
//
//        int M = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine());
//
//        for(int i = 0; i < M; i++){
//            int target = Integer.parseInt(st.nextToken());
//            if(set.contains((target)) sb.append(1).append("\n"));
//            else sb.append(0). append("\n");
//        }
//        System.out.println(sb);

//          백준 : 숫자카드(10815)


//          프로그래머스 : 폰켓몬

//          집합관련함수 : 교집합(retailAll), 합집합(addAll), 차집합(removeAll)
        Set<String> s1 = new HashSet<>();
        s1.add("java");
        s1.add("python");
        s1.add("c++");

        Set<String> s2 = new HashSet<>();
        s1.add("java");
        s1.add("html");
        s1.add("css");

//        s1.retainAll(s2); //s1에는 교집합인 java만 남음
//        System.out.println(s1);
//        s1.removeAll(s2); // s1엔느 차집합인 python, c++이 남음
//        s1.addAll(s2); //s1에는 합집합인 java, python, c++, html, css 가남음

        System.out.println(s2);
        System.out.println(s1);

    }
}
