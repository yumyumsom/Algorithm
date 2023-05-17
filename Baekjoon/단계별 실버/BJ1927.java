import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BJ1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[N];
        int cnt = 0;
        for (int t = 0; t < N; t++) {
            int x = Integer.parseInt(br.readLine());
            if(x>0){
                pq.offer(x);
            }
           else {
                if(!pq.isEmpty()){
                    sb.append(pq.poll()).append("\n");
                }
               else {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
