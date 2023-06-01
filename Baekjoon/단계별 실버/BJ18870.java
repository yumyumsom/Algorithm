import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] ans = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());
            ans[i] = x[i];
        }
        Arrays.sort(x);

        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(x[i])) {
                map.put(x[i], idx);
                idx++;
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(ans[i])).append(" ");
        }
        System.out.println(sb);
    }
}
