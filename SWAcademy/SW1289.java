import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String str = br.readLine();
            int cnt = 0;
            char pre = '0';
            for (int i = 0; i < str.length(); i++) {
                if (pre != str.charAt(i)) {
                    cnt++;
                    pre = str.charAt(i);
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
