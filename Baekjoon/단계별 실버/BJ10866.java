import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int push = 0;

            switch (st.nextToken()) {
                case "push_front":
                    push = Integer.parseInt(st.nextToken());
                    dq.addFirst(push);
                    break;

                case "push_back":
                    push = Integer.parseInt(st.nextToken());
                    dq.addLast(push);
                    break;

                case "pop_front":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollFirst()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "pop_back":
                    if (!dq.isEmpty()) {
                        sb.append(dq.pollLast()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;

                case "size":
                    sb.append(dq.size()).append("\n");
                    break;

                case "empty":
                    if (dq.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;

                case "front":
                    if (!dq.isEmpty()) {
                        sb.append(dq.peekFirst()).append("\n");
                    }else{
                        sb.append("-1").append("\n");
                    }
                    break;

                case "back":
                    if (!dq.isEmpty()) {
                        sb.append(dq.peekLast()).append("\n");
                    }else{
                        sb.append("-1").append("\n");
                    }
                    break;


            }
        }
        System.out.println(sb);
    }
}