import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ1269 {
    public BJ1269() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<Integer> num = new HashSet();
        st = new StringTokenizer(br.readLine());

        int ans;
        for (ans = 0; ans < a; ++ans) {
            num.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (ans = 0; ans < b; ++ans) {
            num.add(Integer.parseInt(st.nextToken()));
        }

        int var10000 = num.size() - b + (num.size() - a);
        ans = Integer.parseInt("" + var10000);
        System.out.println(ans);
    }
}