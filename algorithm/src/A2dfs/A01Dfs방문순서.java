package A2dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class A01Dfs방문순서 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean [] visited;

    public static void main(String[] args) {
        // 출발은 0부터 시작했을떄 dfs로 방문할경우 방문순서
        int[][] nodes = {{0, 1}, {2, 0}, {1, 3}, {2, 3}, {2, 4}};
        visited = new boolean[5];

        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());

        }

        // 인접리스트에 인접해있는 노드값담기
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
        dfs(0);
        System.out.println(adjList);
    }

    static void dfs(int start) {
        System.out.println(start);
        visited[start] = true;
        for (int target : adjList.get(start)) {
            if (!visited[target]) {
                dfs(target);
            }
        }
    }

}

// 관련문제
// DFSBFS(1260) : 백준
//    public static Main{
//    static int Edge_arr[][];
//    static boolean visited_arr[];
//    static int N;
//    static int M;
//    static int V;
//    static int Count;
//    static Queue<Integer> que = new LinkedList<>();
//
//    public static void BFS(int start){
//        que.offer(start);
//        Visited_arr[start] = true;
//            System.out.println(start+"");
//
//            while (!que.isEmpty()){
//                start = que.poll();
//
//                for (int i =1; i<=N; i++){
//                    if(Edge_arr[start][i] == 1 && Visited_arr[i] == false){
//                        que.offer(i);
//                        Visited_arr[i] = true;
//                        System.out.println(i+"");
//                    }
//                }
//            }
//        }
//        public static void DFS(int start){
//        Visited_arr[start] = true;
//            System.out.println(start+"");
//        }
//        if(count == N){
//            return;
//        }
//        count++
//
//                for(int i=1; i<=N; i++){
//                    if (Edge_arr[[start][i] == 1 && Visited_arr[i] == false){
//                        DFS(i);
//                    }
//                }
//        }
//    }
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferdReader(new InputStreamReader(System.in))
//                StringTokenizer st = null;
//
//        st = new StringTokenizer(br.readLine());
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//        v = Integer.parseInt(st.nextToken());
//
//        Edge_arr = new int[1001][1001];
//        Visited_arr =  new boolean[1001];
//
//        for (int i =0; i<M; i++){
//            st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken);
//            int y = Integer.parseInt(st.nextToken());
//
//            Edge_arr[x][y] = Edge_arr[y][x] = 1;
//        }
//        DFS(V);
//        System.out.println();
//
//
//        visited_arr = new boolean[1001];
//        BFS(V);
//    }
// 트리의 부모찾기 : 백준
//import java.io.*;
//import java.util.*;
//public class Main{
//    static ArrayList<Integer> arr[];
//    static int N,a,b,parent[];
//    static boolean visit[];
//    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        N = Integer.parseInt(br.readLine());
//        visit = new boolean[N+1];
//        parent = new int[N+1];
//        arr =new ArrayList[N+1];
//
//        for(int i=1; i<=N; i++){
//            arr[i] = new ArrayList<>();
//        }
//
//        for(int i=1; i<N; i++){
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            a=Integer.parseInt(st.nextToken());
//            b=Integer.parseInt(st.nextToken());
//            arr[a].add(b);
//            arr[b].add(a);
//        }
//        bfs(1);
//
//        for(int i=2; i<=N; i++){
//            System.out.println(parent[i]);
//        }
//    }
//    static void bfs(int start){
//        Queue<Integer> q = new LinkedList<>();
//        q.add(start);
//        visit[start]=true;
//
//        while(!q.isEmpty()){
//            int p = q.poll();
//            for(int next:arr[p]){
//                if(!visit[next]){
//                    visit[next]=true;
//                    q.add(next);
//                    parent[next]=p;
//                }
//            }
//        }

// 백준 11724번 연결요소의 갯수
// 1. for문
// 2. visited 방문체크
//public class {
//    static ArrayList<Integer> arr[];
//
//}



