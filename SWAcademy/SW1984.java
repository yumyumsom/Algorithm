package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 10; i++) {
                arr[i] = Integer.parseInt(st.nextToken());

            }
            Arrays.sort(arr);

            int avg = 0;
            double sum = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                sum += arr[i];
                avg = (int) Math.round(sum / 8);
            }
            sb.append("#" + t + " " + avg + "\n");
        }
        System.out.println(sb);
    }
}