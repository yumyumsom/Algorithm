package SW_Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW12368 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        int time = 0;

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            time = A + B;

            if(time == 24){
                time = 0;
            }else if(time >24){
                time = time-24;
            }else{
               time = time;
            }
            System.out.println("#"+i+" "+time);
        }
    }
}
