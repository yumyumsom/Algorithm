import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ11724 {
    static boolean[] v;
    static int N, M;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);

        }
        int ans = 0;
        v = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            if (!v[i]) {
                bfs(i);
                ans++;
            }
        }
        System.out.println(ans);

    }

    static void bfs(int idx) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        v[idx] = true;

        while (!q.isEmpty()) {
            int num = q.poll();

            for (int i = 0; i < graph.get(num).size(); i++) {
                int tmp = graph.get(num).get(i);
                if (!v[tmp]) {
                    v[tmp] = true;
                    q.offer(tmp);
                }
            }
        }
    }
}

