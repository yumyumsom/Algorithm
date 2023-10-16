package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * 마일리지는 한 과목에 1에서 36까지 넣을 수 있다.
 * 첫째 줄에는 과목 수 n (1 ≤ n ≤ 100)과 주어진 마일리지 m (1 ≤ m ≤ 100)이 주어진다.
 * 각 과목마다 2줄의 입력이 주어지는데 첫째 줄에는 각 과목에 신청한 사람 수 Pi과 과목의 수강인원 Li이 주어지고
 * 그 다음 줄에는 각 사람이 마일리지를 얼마나 넣었는지 주어진다. (1 ≤ Pi ≤100, 1 ≤ Li ≤ 100)
 */

public class BJ12018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] sub = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            Integer[] arr = new Integer[P];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < P; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            if (P < L) {
                sub[i] = 1;
                continue;
            }else{
                Arrays.sort(arr, Collections.reverseOrder());
                sub[i] = arr[L - 1];
            }
        }
        Arrays.sort(sub);
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sub[i];
            if (sum > m) {
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}