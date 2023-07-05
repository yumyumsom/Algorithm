import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> sum = new HashMap<>();
        String book = " ";

        for (int i = 0; i < N; i++) {
            book = br.readLine();
            if (!sum.containsKey(book)) {
                sum.put(book, 1);
            } else {
                sum.put(book, sum.get(book) + 1);
            }
        }

        int max = 0;
        for (String key : sum.keySet()) {
            if (max == sum.get(key) && book.compareTo(key) > 0) {
                book = key;
            } else if (max < sum.get(key)) {
                book = key;
                max = sum.get(key);
            }
        }
        System.out.println(book);
    }
}

