import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());

        long cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] <= B) {
                cnt++;
            } else {
                cnt++;
                arr[i] -= B;
                if (arr[i] % C == 0) {
                    cnt += arr[i] / C;
                } else if (arr[i] % C != 0) {
                    cnt += arr[i] / C + 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
