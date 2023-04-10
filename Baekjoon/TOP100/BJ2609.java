import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ2609 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int d = gcd(A, B);
        int lcm = A*B/d;

        System.out.println(d);
        System.out.println(lcm);

    }

    //함수실행
    public static int gcd(int a, int b) {
        if (b == 0) {
            //b가0이되면 a반환
            return a;
        }
        //재귀호출
        return gcd(b, a % b);
    }
}
