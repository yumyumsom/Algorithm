import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Queue<info> q = new LinkedList<>();
        PriorityQueue<info> pq = new PriorityQueue<>(new Comparator<info>() {
            @Override
            public int compare(info o1, info o2) {
                return o2.importance - o1.importance;
            }
        });
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int value = Integer.parseInt(st.nextToken());
                q.offer(new info(i, value));
                pq.offer(new info(i, value));
            }
            int cnt = 1;
            while (true) {
                if (q.peek().importance == pq.peek().importance) {
                    if (q.peek().idx == M) {
                        break;
                    } else {
                        cnt++;
                        q.poll();
                        pq.poll();
                    }
                } else {
                    q.offer(q.poll());
                }
            }
            q.clear();
            pq.clear();
            System.out.println(cnt);
        }
    }


        static class info {
            int idx;
            int importance;

            public info(int idx, int importance) {
                this.idx = idx;
                this.importance = importance;
            }


        }

    }
