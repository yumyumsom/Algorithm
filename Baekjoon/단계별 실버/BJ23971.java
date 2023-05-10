import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken()); //행
        int W = Integer.parseInt(st.nextToken()); //열
        int N = Integer.parseInt(st.nextToken()); //행
        int M = Integer.parseInt(st.nextToken()); //열
        int height = 0;
        int weight = 0;
        height = (H - 1) / (N + 1) + 1;
        weight = (W - 1) / (M + 1) + 1;
        int ans = height * weight;
        System.out.println(ans);
    }
}

