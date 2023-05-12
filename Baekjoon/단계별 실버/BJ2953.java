import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int max =0;
        int num = 0;
        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            int[][] score = new int[6][5];
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 4; j++) {
                score[i][j] = Integer.parseInt(st.nextToken());
                sum += score[i][j];
            }
            if (max < sum) {
                max = sum;
                num=i;
            }
        }
        System.out.println(num+" "+max);
    }
}
