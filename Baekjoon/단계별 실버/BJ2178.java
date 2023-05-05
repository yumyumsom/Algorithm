import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2178 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        char[][] maze = new char[N][M];

        for (int i = 0; i < N; i++) {
            maze[i] = br.readLine().toCharArray();

            bfs(maze);
        }
    }

    static void bfs(char[][] maze) {
        Queue<Dist> q = new LinkedList<>();
        q.offer(new Dist(0, 0, 1));
        boolean[][] v = new boolean[N][M];
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};
        v[0][0] = true;

        while (!q.isEmpty()) {
            Dist dist = q.poll();
            if (dist.x == N - 1 && dist.y == M - 1) {
                System.out.println(dist.cnt);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = dist.x + dx[i];
                int ny = dist.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                } else {
                    if (!v[nx][ny] && maze[nx][ny] == '1') {
                        v[nx][ny] = true;
                        q.offer(new Dist(nx, ny, dist.cnt + 1));
                    }
                }
            }
        }
    }

    static class Dist {
        int x;
        int y;
        int cnt;

        public Dist(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
}
