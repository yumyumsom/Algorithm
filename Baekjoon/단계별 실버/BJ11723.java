import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Set<Integer> S = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        while (N-- >0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if (str.equals("all")) {
                S.clear();
                for (int j = 1; j <= 20; j++) {
                    S.add(j);
                }
            } else if (str.equals("empty")) {
                S.clear();

            } else {
                int num = Integer.parseInt(st.nextToken());
                if (str.equals("add")) {
                    S.add(num);
                } else if (str.equals("remove")) {
                    S.remove(num);

                } else if (str.equals("check")) {
                    if (S.contains(num)) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }

                } else if (str.equals("toggle")) {
                    if (S.contains(num)) {
                        S.remove(num);
                    } else {
                        S.add(num);
                    }

                }

            }
        }
        System.out.println(sb);
    }
}