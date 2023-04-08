import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int sum = 0;
        int line = 1;
        int a = 0;
        int b = 0;

        while (sum + line < X) {
            sum= line+sum;
            line++;

        }

        a = X- sum;
        b = (line+1)-a;

        if (line % 2 == 0) {
            System.out.println(a + "/" + b);
        }else{
            System.out.println(b + "/" + a);

        }

    }
}
