import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] num = new int[s.length()];
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            num[i] = s.charAt(i) - 48;
            ans += num[i];

        }
        

        Arrays.sort(num);
        if (ans % 3 == 0 && num[0] == 0) {
            for (int i = num.length-1; i >=0; i--) {
                sb.append(num[i]);
            }
        }else{
            System.out.println(-1);
        }

        System.out.println(sb);


    }
}
