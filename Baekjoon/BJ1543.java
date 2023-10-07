import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        String search = br.readLine();

        int size = text.length();
        int size2 = search.length();


        text = text.replace(search, "");
        System.out.println((size-text.length())/size2);

    }


}