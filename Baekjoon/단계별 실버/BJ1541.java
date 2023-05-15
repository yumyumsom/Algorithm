import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        String[] cal = s.split("[0-9]");
        String[] num = s.split("[-|+]");

        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < cal.length; i++) {
            if (cal[i].equals("-") || cal[i].equals("+")) {
                q.offer(cal[i]);
            }
        }
        boolean f = false;
        int ans = Integer.parseInt(num[0]);
        for (int i = 1; i < num.length; i++) {
            String op = q.poll();
            if (op.equals("-")) {
                ans -= Integer.parseInt(num[i]);
                f = true;
            } else {
                if (f == true) {
                    ans -= Integer.parseInt(num[i]);
                } else {
                    ans += Integer.parseInt(num[i]);
                }
            }
        }
        System.out.println(ans);
    }
}
