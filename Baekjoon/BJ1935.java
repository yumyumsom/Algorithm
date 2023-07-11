import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        double[] num = new double[N];
        for (int i = 0; i < N; i++) {
            num[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();
        double ans = 0;

        for (int i = 0; i < str.length(); i++) {
        //for (int i = 0; i < N; i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                stack.push(num[str.charAt(i) - 'A']);
            }else{
                if (!stack.isEmpty()) {
                    double first = stack.pop();
                    double next = stack.pop();
                    switch (str.charAt(i)){
                        case '+':
                            ans = next + first;
                            stack.push(ans);
                            continue;
                        case '-':
                            ans = next - first;
                            stack.push(ans);
                            continue;
                        case '*':
                            ans = next * first;
                            stack.push(ans);
                            continue;
                        case '/':
                            ans = next / first;
                            stack.push(ans);
                            continue;
                    }
                }
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}
