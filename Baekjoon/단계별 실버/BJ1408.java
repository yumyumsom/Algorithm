import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] time = br.readLine().split(":");
        String[] time2 = br.readLine().split(":");

        int A = Integer.parseInt(time[0]) * 3600
                + Integer.parseInt(time[1]) * 60
                + Integer.parseInt(time[2]);

        int B = Integer.parseInt(time2[0]) * 3600
                + Integer.parseInt(time2[1]) * 60
                + Integer.parseInt(time2[2]);

        if (A > B) {
            B = B + 86400;
        }
        int ans = B - A;

        String h = String.valueOf(ans / 3600);
        ans = ans % 3600;
        String m = String.valueOf(ans / 60);
        String s = String.valueOf(ans % 60);

        if (h.length() == 1) {
            h = "0" + h;
        }
        if (m.length() == 1) {
            m = "0" + m;
        }
        if (s.length() == 1) {
            s = "0" + s;
        }

        System.out.println(h + ":" + m + ":" + s);
    }
}