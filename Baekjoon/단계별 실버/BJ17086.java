import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ17086 {
    static int N, M;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    static int[][] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j]==0){
                    bfs(i, j);
                }
            }
        }
        System.out.println(ans);

    }

    static void bfs(int start, int end) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] v = new boolean[N][M];
        v[start][end] = true;
        q.offer(new Node(start, end,0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            if(arr[node.x][node.y]==1){
                ans = Math.max(ans, node.cnt);
                break;
            }
            for (int i = 0; i < 8; i++) {

                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                if (!v[nx][ny]) {
                    v[nx][ny] = true;
                    q.offer(new Node(nx, ny,node.cnt+1));
                }
            }
        }
    }


    static class Node {
        int x;
        int y;
        int cnt;

        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
