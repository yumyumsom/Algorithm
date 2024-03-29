import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[8];

        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        String ans = "";
        for (int i = 0; i < 7; i++) {
            if (arr[i] == arr[i + 1] - 1) {

                ans = "ascending";
            } else if (arr[i] == arr[i + 1] + 1) {

                ans = "descending";

            } else {
                ans = "mixed";
                break;
            }
        }
        System.out.println(ans);
    }
}
