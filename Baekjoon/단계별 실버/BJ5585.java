import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int money = 1000 - n;
        int[] coin = {500, 100, 50, 10, 5, 1};
        int ans = 0;

        
        for (int i = 0; i < coin.length; i++) {
            if (money / coin[i] > 0) {
                ans += money / coin[i];
                money = money % coin[i];
            }
        }
        System.out.println(ans);
    }
}
