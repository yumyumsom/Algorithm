import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                sb.append("A").append("\n");
            } else if (cnt == 2) {
                sb.append("B").append("\n");
            } else if (cnt == 3) {
                sb.append("c").append("\n");
            } else if (cnt == 4) {
                sb.append("D").append("\n");
            } else{
                sb.append("E").append("\n");
            }
        }
        System.out.print(sb);

    }
}
