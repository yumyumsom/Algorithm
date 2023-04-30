import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] ans = new int[N][N];
            String[] result = new String[N];
            Arrays.fill(result, "");//null값 없애주기위해 빈문자를 채워줌

            for (int x = 0; x < 3; x++) {
                rotate(N, arr, ans);
                for (int i = 0; i < ans.length; i++) {
                    for (int j = 0; j < ans.length; j++) {
                        arr[i][j] = ans[i][j];
                    }
                }
                copyArr(N, ans, result);
            }

            sb.append("#" + t).append("\n");
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i] + "\n");
            }
        }
        System.out.println(sb);
    }

    private static void copyArr(int N, int[][] ans, String[] result) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i] += ans[i][j];
            }
            result[i] += " ";
        }
    }

    private static void rotate(int N, int[][] arr, int[][] ans) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ans[i][j] = arr[N - j - 1][i];
            }

        }
    }
}