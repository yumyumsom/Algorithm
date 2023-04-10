import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> ans = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 1;

        Queue<Integer> Circular_Queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            Circular_Queue.offer(i);
        }

        while (!Circular_Queue.isEmpty()) {
            if (cnt%K ==0){
                ans.add(Circular_Queue.poll());
        }else {
                Circular_Queue.offer(Circular_Queue.poll());
            }
            cnt++;
    }
        System.out.println("<"+ans.toString().substring(1,ans.toString().length()-1)+">");


}
}
