import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 문제의 핵심!! 문자의 마지막 위치를 배열에 저장해준다
 * */

public class BJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int[] alpha = new int[26];
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                int idx = s.charAt(j) - 97;

                if (alpha[idx] == 0) {
                    alpha[idx] = j + 1;
                } else {
                    if (alpha[idx] + 1 == j + 1) {
                        alpha[idx] = j + 1;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}