import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j = 0; j < total; j++) {
                    if ((j + 1) % number == 0) {
                        arr[j] = arr[j] == 0 ? 1 : 0;
                    }
                }
            } else {
                arr[number - 1] = arr[number - 1] == 0 ? 1 : 0;
                for (int j = 0; j < total / 2; j++) {
                    if (number - 1 + j >= total || number - 1 - j < 0) {
                        break;
                    }
                    if (arr[number - 1 + j] == arr[number - 1 - j]) {
                        arr[number - 1 + j] = arr[number - 1 + j] == 0 ? 1 : 0;
                        arr[number - 1 - j] = arr[number - 1 - j] == 0 ? 1 : 0;
                    }
                    else break;
                }
            }
        }
        for (int i = 0; i < total; i++) {
            System.out.print(arr[i] + " ");
            if ((i+1) % 20 == 0) {
                System.out.println();

            }
        }

    }
}