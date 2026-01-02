package A3bfs;

import java.nio.Buffer;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class A04그외유형 {
    // 이차원 배열의 최단거리 : 게임 맵 최단거리 - 프로그래머스
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};
    private static final int[] dz = {0,0,0,0,1,-1};

    static int M;
    static int N;

    public int solution(int[][] maps) {
        // 맵 크기 파악
        int n = maps.length;
        int m = maps[0].length;

        // 방문 여부 배열 선언
        boolean[][] visited = new boolean[n][m];
        // BFS를 위한 큐 생성
        Queue<int[]> queue = new LinkedList<>();
        // 시작 위치 큐에 넣기
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        // BFS 시작
        while (!queue.isEmpty()) { // bfs
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int cnt = current[2];

            // 도착했는지 확인
            if (x == n - 1 && y == m - 1) {
                return cnt; // 최단 거리 반환 (bfs: 가장 처음 return 되는게 최단 거리)
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cnt + 1});
                }
            }
        }
        return -1;

//         숨바꼭질(1697) - 백준
//        public class Main {
//            public static void main(String[] args) throws IOException {
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                StringTokenizer st = new StringTokenizer(br.readLine());
//                int n = Integer.parseInt(st.nextToken());
//                int k = Integer.parseInt(st.nextToken());
//                if (n == k) {
//                    System.out.println(0);
//                    return;
//                }
//                boolean[] visited = new boolean[100001];
//                visited[n] = true;
//                Queue<Integer> q = new LinkedList<>();
//                q.add(n);
//                int size = q.size();
//                int count = 0;
//                while (true) {
//                    count++;
//                    size = q.size();
//                    for (int i = 0; i < size; i++) {
//                        int x = q.remove();
//                        visited[x] = true;
//                        if (x - 1 == k || x + 1 == k || x * 2 == k) {
//                            System.out.println(count);
//                            return;
//                        }
//                        if (x - 1 >= 0 && !visited[x - 1]) {
//                            visited[x - 1] = true;
//                            q.add(x - 1);
//                        }
//                        if (x + 1 <= 100000 && !visited[x + 1]) {
//                            visited[x + 1] = true;
//                            q.add(x + 1);
//                        }
//                        if (x * 2 <= 100000 && !visited[x * 2]) {
//                            visited[x * 2] = true;
//                            q.add(x * 2);
//                        }
//                    }
//                }
//            }
//        }
//        public class Main {
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//
//                int N = in.nextInt();
//                in.close();
//
//                int cnt = 0;
//                int copy = N;
//
//                while (true) {
//                    N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
//                    cnt++;
//
//                    if (copy == N) {
//                        break;
//                    }
//                }
//                System.out.println(cnt);
//    public class Main {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                int n = sc.nextInt();
//                int x = n;
//                int count = 0;
//
//                while (true) {
//                    int ten = x / 10;
//                    int one = x % 10;
//
//                    x = one * 1 - +(ten + one) % 10;
//                    count++;
//
//                    if (n == x)
//                        break;
//                }
//                System.out.println(count);
//                sc.close();
//            }
//        }
//
//        import java.util.*;
//        import java.io.*;
//        public class Main{
//            public static void main(String[] arg)throws IOException{
//                int answer = 0;
//                int n = Integer. parseInt(br.readLine());
//                int copy = 0;
//
//                while (true){
//                    int ten = copy / 10 //10자리
//                    int one = copy % 10 // 1의 자리
//                    copy = one * 10 +(ten + one) % 10;
//                    answer++;
//                    if (n == copy) break;
//                }
//                System.out.println(answer);
//            }
//        }
    }
}

