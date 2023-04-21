import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] size = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            size[0][i] = Integer.parseInt(st.nextToken());
            size[1][i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {

                if (size[0][i] < size[0][j] && size[1][i] < size[1][j]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }

    }
}
