import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = "";

        if (N % 2 == 0) {
            str = "CY";
        } else {
            str = "SK";
        }

        System.out.println(str);
    }
}
