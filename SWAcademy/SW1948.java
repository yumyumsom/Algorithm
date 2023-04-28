import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int[] cal = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

            st = new StringTokenizer(br.readLine());
            int Mon1 = Integer.parseInt(st.nextToken());
            int day1 = Integer.parseInt(st.nextToken());
            int Mon2 = Integer.parseInt(st.nextToken());
            int day2 = Integer.parseInt(st.nextToken());


            int ans = 0;
            ans = (cal[Mon2-1] + day2) - (cal[Mon1-1] + day1) +1;

            sb.append("#" + t + " " + ans + "\n");
        }
        System.out.println(sb);
    }
}