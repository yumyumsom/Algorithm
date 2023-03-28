import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = br.readLine().split("");

        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 10 == 0) {
                sb.append(arr[i]).append("\n");
            } else {
                sb.append(arr[i]);
            }

        }
        System.out.println(sb.toString());

    }
}


