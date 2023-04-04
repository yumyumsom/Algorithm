import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();

        int cnt = 0;
        char maxAlpha = 0;
        int alpahbet[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 65;    //정수형으로 변환해서 인덱스로 사용

            //인덱스는 0부터 25
            alpahbet[idx]++;
            if (cnt < alpahbet[idx]) {
                cnt = alpahbet[idx];
                maxAlpha = c;
            }
        }

        int maxCnt = 0;
        //최대값(cnt)가 또 존재하는지
        for (int i = 0; i < alpahbet.length; i++) {
            if (alpahbet[i] == cnt) {
                maxCnt++;
            }
        }

        if (maxCnt > 1) {
            System.out.println("?");

        } else {
            System.out.println(maxAlpha);

        }

    }
}
