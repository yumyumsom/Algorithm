import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ1260 {
    static int N, M, V;
    static List<List<Integer>> graph = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());

        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for (int i = 0; i < N + 1; i++) {
            Collections.sort(graph.get(i));
        }

        boolean[] visited = new boolean[N + 1];
        visited[V] = true;
        sb.append(V).append(" ");
        dfs(V, visited);
        sb.append("\n");

        visited = new boolean[N + 1];
        visited[V] = true;
        sb.append(V).append(" ");
        bfs(V, visited);

        System.out.println(sb);
    }

    static void dfs(int start, boolean[] v) {
        for (int i = 0; i < graph.get(start).size(); i++) {
            int num = graph.get(start).get(i);
            if (!v[num]) {
                sb.append(num).append(" ");
                v[num] = true;
                dfs(num, v);
            }
        }
    }

    static void bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (int i = 0; i < graph.get(tmp).size(); i++) {
                int num = graph.get(tmp).get(i);
                if (!visited[num]) {
                    sb.append(num).append(" ");
                    visited[num] = true;
                    queue.offer(num);
                }
            }

        }
    }
}