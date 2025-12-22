package C02MethodClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//재귀함수 활용 대표적인 알고리즘 예시 : 백트래킹, dfs 알고리즘에서 주로 사용.(또는 분할정복)
//대표적인 백트래킹 예시 : 조합과 순열에서 경우의 수 찾기

public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("hello world");
            }
        }

//        for (int i = 0; i < 3; i++){
//            for (int j=0; i <3; j++){
//                System.out.println("hello world");
//            }
//        }

////       위 for문의 반복횟수(개수)는 동적으로 결정되지 않고, 정적으로 코딩할수밖에 없는 한계가 존재.
        recurFor(0, 3);

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

//        위 for문의 반복횟수(개수)는 동적으로 결정되지 않고, 정적으로 코딩할수밖에 없는 한계가 존재
//        recurFor(0, 3);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);

//        숫자 1,2,3,4를 가지고 만들수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
//        [[1,2] [1,3] [1,4] [2,3] [2,4] [3,4]]
        List<List<Integer>> doubeList = new ArrayList<>();
        for (int i=0; i<myList.size(); i++){
            for (int j=i+1; j<myList.size(); j++){
                List<Integer> list1 = new ArrayList<>();
                list1.add(myList.get(i));
                list1.add(myList.get(j));
                doubeList.add(list1);
            }
        }
        System.out.println(doubeList);

//        숫자 1,2,3,4를 가지고 만들수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
//        [[1,2] [1,3] [1,4] [2,3] [2,4] [3,4]]
//        List<List<Integer>> doubleList = new ArrayList<>();
//        for (int i = 0; i<myList.size(); i++){
//            for (int j = j+1; j<myList.size(); j++){
//                List<Integer> list1 = new ArrayList<>();
//                list1.add(myList.get(i));
//                list1.add(myList.get(j));
//                doubleList.add(list1);
//            }
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);

//        재귀함수를 만들기 위한 for문 변형
//        List<List<Integer>> doubeList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i=0; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            for (int j=i+1; j<myList.size(); j++){
//                temp.add(myList.get(j));
//                doubeList.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
//        System.out.println(doubeList);
//
//        List<List<Integer>> doubleList = new ArrayList<>();
//        combi(new ArrayList<>(), 0, myList, 4, doubleList); //원본, 2개짜리 조합, 조합을 담을 이중리스트
//        System.out.println(doubleList);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);

//        List<List<Integer>> doubeList = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        boolean[] visitied = new boolean[myList.size()];
//        for (int i=0; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            visitied[i] = true;
//            for (int j=0; j<myList.size(); j++){
//                if(visitied[j])continue;
//                temp.add(myList.get(j));
//                visitied[j]=true;
//                doubeList.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//                visitied[j]=false;
//            }
//            temp.remove(temp.size()-1);
//            visitied[i]=false;
//        }
//        System.out.println(doubeList);
        List<List<Integer>> doubleList = new ArrayList<>();
        permu(new boolean[myList.size()], new ArrayList<>(), myList, 2, doubleList);
        System.out.println(doubleList);

//        백준 : 15649(N과 M), 6603(로또)

    }

    public static void permu(boolean[] visited, List<Integer> temp, List<Integer> myList, int n, List<List<Integer>> doubleList){
        if(temp.size()==n){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0; i<myList.size(); i++){
            if(visited[i])continue;
            temp.add(myList.get(i));
            visited[i] = true;
            permu(visited, temp, myList, n,  doubleList);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }

    public static void combi(List<Integer> temp, int start ,List<Integer> myList, int n, List<List<Integer>> doubleList){
        if(temp.size()==n){
            doubleList.add(new ArrayList<>(temp));
            return;
        }
        for (int i=start; i<myList.size(); i++){
            temp.add(myList.get(i));
            combi(temp, i+1, myList, n,  doubleList);
            temp.remove(temp.size()-1);
        }
    }

    public static void recurFor(int start, int end){
        if(start==end){
            return;
        }
        for (int i=0; i<3; i++){
            System.out.println("hello world");
            recurFor(start+1, end);
        }
    }
}

//    백준 : 15649(N과M), 6603(로또)

