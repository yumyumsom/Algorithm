package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int max = arr[N - 1];
            long cost = 0;
            for (int k = N - 2; k >= 0; k--) {

                if (arr[k] > max) {
                    max = arr[k];
                } else {
                    cost += max - arr[k];
                }
            }
            sb.append("#" + i + " " + cost+"\n");


        }
        System.out.println(sb);


    }
}

