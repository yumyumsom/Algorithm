import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] result = new int[N][4];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                result[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Arrays.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    if (o1[2] == o2[2]) {
                        return o2[3] - o1[3];
                    }
                    return o2[2] - o1[2];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });
        int[] rank = new int[N];
        rank[0]=1;
        int answer = rank[0];
        for (int i = 1; i < N; i++) {
            if (result[i][1] == result[i - 1][1]
                    && result[i][2] == result[i - 1][2]
                    && result[i][3] == result[i - 1][3]) {
                rank[i] = rank[i-1];

            }else{
                rank[i] = i+1;
            }

            if (result[i][0] == K) {
                answer=rank[i];
                break;
            }

        }
        System.out.println(answer);
    }

}

