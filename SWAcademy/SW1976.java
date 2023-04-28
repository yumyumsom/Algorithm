import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(br.readLine());
            int hour1 = Integer.parseInt(st.nextToken());
            int min1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int min2 = Integer.parseInt(st.nextToken());

            int Hour = 0;
            int Min = 0;

            Hour = hour1 + hour2;
            Min = min1 + min2;
            if (Hour > 12) {
                Hour = Hour - 12;
            }
            if(Min >59){
                Hour++;
                Min = Min-60;

        }
            sb.append("#"+t+" "+Hour+" "+Min+"\n");
    }
        System.out.println(sb);


}
}
