import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1018 {
    static char[] w = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
    static char[] b = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        char[][] tmp = new char[8][8];
        char[][] chess = new char[8][8];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                ans = Math.min(ans, paintCount(i, j));
            }
        }
        System.out.println(ans);

    }

    static int paintCount(int start, int end) {
        int wcnt = 0;
        int bcnt = 0;

        for (int i = start; i < start + 8; i++) {
            for (int j = end; j < end + 8; j++) {

                if (i % 2 == 0 && board[i][j] != w[j - end]) {
                    wcnt++;
                }
                if (i % 2 == 1 && board[i][j] != b[j - end]) {
                    wcnt++;
                }
                if (i % 2 == 0 && board[i][j] != b[j - end]) {
                    bcnt++;
                }
                if (i % 2 == 1 && board[i][j] != w[j - end]) {
                    bcnt++;
                }
            }
        }
        return Math.min(wcnt, bcnt);
    }
}
