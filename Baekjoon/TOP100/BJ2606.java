import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> list = new ArrayList<>();

        int M = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N + 1; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 1; i < M + 1; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.get(start).add(end);
            list.get(end).add(start);

        }


        Queue<Integer> q = new LinkedList<>();

        boolean[] visit = new boolean[N + 1];

        q.offer(1);

        visit[1] = true;

        while (!q.isEmpty()) {
            int c = q.poll();

            List<Integer> tmp = list.get(c);

            for (int i = 0; i <tmp.size(); i++) {
               if(!visit[tmp.get(i)]){
                   visit[tmp.get(i)] = true;
                   q.offer(tmp.get(i));
                   cnt++;
               }

            }

        }
        System.out.println(cnt);

    }
}

