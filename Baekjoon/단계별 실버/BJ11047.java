package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] num = new Integer[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(num, Collections.reverseOrder());

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (K >= num[i]) {
                cnt += K / num[i];

                K = K % num[i];
            }
        }
        System.out.println(cnt);
    }
}

