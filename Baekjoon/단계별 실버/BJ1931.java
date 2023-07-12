import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] room = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(room, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }else{
                    return o1[1] - o2[1];
                }
            }
        });

        int cnt = 0;
        int prev = 0;

        for (int i = 0; i < N; i++) {
            if (prev <= room[i][0]) {
                prev = room[i][1];

                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
