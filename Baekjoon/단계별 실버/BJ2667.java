import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ2667 {
    static int N;
    static char[][] house;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        house = new char[N][N];

        for (int i = 0; i < N; i++) {
            house[i] = br.readLine().toCharArray();
        }
        int cnt = 0;
        List<Integer> ans = new ArrayList<>();
        boolean[][] v = new boolean[N][N];
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house.length; j++) {
                if (house[i][j] == '1' && v[i][j] != true) {
                    v[i][j] = true;
                    int result = bfs(i, j, v);
                    ans.add(result);
                    cnt++;
                }

            }
        }
        sb.append(cnt).append("\n");
        Collections.sort(ans);

        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");

        }
        System.out.println(sb);
    }

    static int bfs(int start, int end, boolean[][] v) {
        int sum = 1;
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(start, end));
        while (!q.isEmpty()) {
            Point point = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                }
                if (!v[nx][ny] && house[nx][ny] == '1') {
                    v[nx][ny] = true;
                    sum++;
                    q.offer(new Point(nx, ny));
                }

            }
        }
        return sum;

    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

