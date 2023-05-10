import java.util.Arrays;
import java.util.Stack;

public class PG_주식가격 {
    public static void main(String[] args) {
        PG_주식가격 sol = new PG_주식가격();
        int[] arr = {1, 2, 3, 2, 3};
        sol.solution(arr);
    }

        public int[] solution(int[] prices) {

            int[] ans = new int[prices.length];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < prices.length; i++) {
                while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {

                    ans[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
            while (!stack.isEmpty()) {
                ans[stack.peek()] = prices.length - stack.peek() - 1;
                stack.pop();
            }
            System.out.println(Arrays.toString(ans));
            return ans;
        }
    }
