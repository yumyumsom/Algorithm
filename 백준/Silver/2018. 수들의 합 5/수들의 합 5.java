import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int left = 1;
        int right = 1;
        int sum = 1;
        int cnt = 0;

        while (right <= N) {
            if (sum == N) {
                cnt++;
                right++;
                if (right <= N) {
                    sum+=right;
                }
            } else if (sum < N) {
                right++;
                sum+=right;
            } else  {
                sum-=left;
                left++;
            }
        }
        System.out.println(cnt);
    }
}