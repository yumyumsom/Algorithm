import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] alpha = new int[26];

        char[] name = new char[N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            name[i] = s.charAt(0);
        }
        for (int i = 0; i < N; i++) {
            alpha[name[i] - 'a']++;
        }
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] >= 5) {
                sb.append((char) (i + 97));
            }

        }
        if (sb.length() == 0) {
            System.out.print("PREDAJA");
        } else {
            System.out.print(sb);
        }
    }

}
