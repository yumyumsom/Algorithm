import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        char[][] alpha = new char[5][15];

        for (int i = 0; i < alpha.length; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                alpha[i][j] = s.charAt(j);

            }

        }


        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (alpha[j][i] == '\0') {
                    continue;
                }
                sb.append(alpha[j][i]);

            }
        }
        System.out.println(sb);
    }
}

