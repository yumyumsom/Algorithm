import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ26215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }

        int ans = 0;
        while (pq.size() > 1) {
            int time = pq.poll();
            int time2 = pq.poll();
            ans++;
            if (time - 1 > 0) {
                pq.offer(time - 1);
            }
            if (time2 - 1 > 0) {
                pq.offer(time2 - 1);
            }
        }

        if (!pq.isEmpty()) {
            ans += pq.poll();
        }
        if (ans > 1440) {
            ans = -1;

        }
        System.out.println(ans);
    }
}
