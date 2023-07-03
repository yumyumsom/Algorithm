import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ3986 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (N-- > 0) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            int len = str.length();

            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                if (stack.isEmpty()) {
                    stack.add(c);
                } else {
                    if (stack.peek() == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}