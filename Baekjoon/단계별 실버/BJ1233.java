import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int[] s1 = new int[Integer.parseInt(arr[0])];
        int[] s2 = new int[Integer.parseInt(arr[1])];
        int[] s3 = new int[Integer.parseInt(arr[2])];
        int result = 0;

        for (int i = 0; i < s1.length; i++) {
            s1[i] = i + 1;
        }
        for (int i = 0; i < s2.length; i++) {
            s2[i] = i + 1;
        }
        for (int i = 0; i < s3.length; i++) {
            s3[i] = i + 1;
        }
        int[] cnt = new int[81];
        for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
            for (int j = 0; j < Integer.parseInt(arr[1]); j++) {
                for (int k = 0; k < Integer.parseInt(arr[2]); k++) {
                    cnt[s1[i] + s2[j] + s3[k]]++;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < cnt.length; i++) {
            ans = Math.max(ans, cnt[i]);
        }
        for (int i = 0; i < cnt.length; i++) {
            if (ans == cnt[i]) {
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}