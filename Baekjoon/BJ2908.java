import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //stringBuilder에 입력받은 값 reverse해서 저장해주기
        StringBuilder a = new StringBuilder(st.nextToken()).reverse();
        int A = Integer.parseInt(a.toString());

        StringBuilder b = new StringBuilder(st.nextToken()).reverse();
        int B = Integer.parseInt(b.toString());

        if(A>B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }

    }
}
