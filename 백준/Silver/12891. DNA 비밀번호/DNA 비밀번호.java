import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String dna = br.readLine();

        st = new StringTokenizer(br.readLine());
        int[] need = new int[4];
        for (int i = 0; i < 4; i++) {
            need[i] = Integer.parseInt(st.nextToken());
        }

        int[] cur = new int[4];
        for (int i = 0; i < P; i++) {
            add(dna.charAt(i), cur);
        }

        int cnt = 0;
        for (int i = 0; i <= S - P; i++) {
            if (check(cur, need)) {
                cnt++;
            }
            if (i + P < S) {
                remove(dna.charAt(i), cur);
                add(dna.charAt(i + P), cur);
            }
        }
        System.out.println(cnt);

    }

    public static void add(char c, int[] cur) {
        if (c == 'A') {
            cur[0]++;
        } else if (c == 'C') {
            cur[1]++;
        } else if (c == 'G') {
            cur[2]++;
        } else if (c == 'T') {
            cur[3]++;
        }
    }

    public static void remove(char c, int[] cur) {
        if (c == 'A') {
            cur[0]--;
        } else if (c == 'C') {
            cur[1]--;
        } else if (c == 'G') {
            cur[2]--;
        } else if (c == 'T') {
            cur[3]--;
        }
    }

    public static boolean check(int[] cur, int[] need) {
        for (int i = 0; i < 4; i++) {
            if (cur[i] < need[i]) return false;
        }
        return true;
    }
}