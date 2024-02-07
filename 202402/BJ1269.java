import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> num = new HashSet<Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            num.add(Integer.parseInt(st.nextToken()));
        }
        int ans = Integer.parseInt((num.size() - b) + (num.size() - a) + "");

        System.out.println(ans);
    }
}