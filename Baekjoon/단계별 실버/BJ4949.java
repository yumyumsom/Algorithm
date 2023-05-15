import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();

            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != '(' && c != ')'
                        && c != '[' && c != ']') {
                    continue;
                }
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (stack.peek() == '[' && c == ']') {
                    stack.pop();

                } else if (stack.peek() == '(' && c == ')') {
                    stack.pop();

                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }

        }
        System.out.println(sb);
    }
}
