package A2dfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A03Dfs모든경우의수와백트래킹 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static List<List<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) {
        // 출발은 0부터 시작했을떄 dfs로 방문할경우 방문순서
        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {4, 9}, {5, 10}};

        for (int i = 0; i < 11; i++) {
            adjList.add(new ArrayList<>());

        }

        // 여기서는 1번이 루트노드라고 가정했기에, visited를 제외하고 단방향 노드로 설계
        for (int[] n : nodes) {
            // 양방향 간선인 경우
            adjList.get(0).add(1);
            adjList.get(1).add(0);
            System.out.println(adjList);
        }

        // 정점번호가 작은것부터 방문하기위한 정렬작업
        for (List<Integer> l : adjList) {
            l.sort(Comparator.reverseOrder());
        }
        dfs(1, new ArrayList<>());
        System.out.println(answer);
    }

    // answer = [[1,2,4,8],[1,2,4,9],[1,2,5,10],[1,3,6],[1,3,7]
    static void dfs(int start, List<Integer> temp) {
        temp.add(start);
        if (adjList.get(start).isEmpty()) {
            answer.add(new ArrayList<>(temp));
        }
        for (int target : adjList.get(start)) {
            dfs(target, temp);
            temp.remove(temp.size()-1);
        }
    }
}

// 관련문제(완전탐색&&백트래킹) : 피로도 - 프로그래머스