import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                cnt++;
                ans.add(s);
            }
        }
        Collections.sort(ans);

        System.out.println(cnt);
        for (int i = 0; i < ans.size(); i++) {

            System.out.println(ans.get(i));
        }

    }
}