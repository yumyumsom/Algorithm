import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        String minA = "";
        String minB = "";
        String maxA = "";
        String maxB = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '5' || a.charAt(i) == '6') {
                minA += "5";
                maxA += "6";

            } else {
                minA += a.charAt(i);
                maxA += a.charAt(i);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '5' || b.charAt(i) == '6') {
                minB += "5";
                maxB += "6";
            } else {
                minB += b.charAt(i);
                maxB += b.charAt(i);
            }

        }
        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

        System.out.print(min +" "+ max);
    }
}


