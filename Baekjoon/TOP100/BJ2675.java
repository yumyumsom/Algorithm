import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            s = st.nextToken();

            for(int i=0; i<s.length(); i++){
                char c =s.charAt(i);
                for (int j = 0; j < R; j++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
