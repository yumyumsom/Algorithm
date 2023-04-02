import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2441 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
