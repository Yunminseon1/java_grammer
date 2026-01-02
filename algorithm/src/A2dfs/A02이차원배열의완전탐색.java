package A2dfs;

import java.util.HashSet;
import java.util.Set;
import java.util .*;
import java.io .*;

public class A02이차원배열의완전탐색 {

    static int[][] map = new int[5][5];
    static Set<String> set = new HashSet<>();

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {

        // 예시 입력
        int[][] temp = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        map = temp;

        // 모든 칸에서 DFS 시작
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, "" + map[i][j]);
            }
        }

        System.out.println(set.size());
    }

    static void dfs(int x, int y, String num) {

        // 길이가 6이면 저장 후 종료
        if (num.length() == 6) {
            set.add(num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5)
                continue;

            dfs(nx, ny, num + map[nx][ny]);
        }
    }
    //관련 문제풀이 : 숫자판 점프 -백준
    public class Main {
        static String numMap[][] = new String[5][5];
        static int dx[] = {0, 0, 1, -1}; // 상하좌우 이동
        static int dy[] = {1, -1, 0, 0}; // 상하좌우 이동
        static HashSet<String> answer = new HashSet<>();

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            for (int i = 0; i < 5; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++) {
                    numMap[i][j] = st.nextToken();
                }
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    dfs(i, j, numMap[i][j], 0);
                }
            }
            System.out.println(answer.size());
        }

        public static void dfs(int x, int y, String route, int count) {
            if (count == 5) {
                answer.add(route);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nowX = x + dx[i];
                int nowY = y + dy[i];
                if (0 <= nowX && nowX < 5 && 0 <= nowY && nowY < 5) {
                    dfs(nowX, nowY, route + numMap[nowX][nowY], count + 1);
                }
            }
        }
    }
}




