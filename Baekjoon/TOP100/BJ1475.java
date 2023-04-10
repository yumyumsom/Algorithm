import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int arr[] = new int[10];

        for (int i = 0; i < N.length(); i++) {
            int num = Integer.parseInt(String.valueOf(N.charAt(i) - '0'));

            if (num == 6 || num == 9) {
                arr[9]++;
                arr[6]++;
            } else {
                arr[num]++;
            }
        }

        arr[6] = arr[6] / 2 + arr[6] % 2;

        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
