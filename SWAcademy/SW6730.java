import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW6730 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String[] arr = s.split(" ");
            int[] height = new int[N];

            int up = 0;
            int down = 0;
            for (int i = 0; i < N; i++) {
                height[i] = Integer.parseInt(arr[i]);
            }
            for (int i = 0; i < height.length-1; i++) {
                int dif = height[i] - height[i + 1];
                if (dif < 0 && up < Math.abs(dif)) {
                    up = Math.abs(dif);
                } else if (dif > 0 && down < dif) {
                    down = dif;
                }

            }
            System.out.println("#"+t+" "+ up+" "+down);
        }
    }
}
