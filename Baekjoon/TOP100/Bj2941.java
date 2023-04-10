import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] Alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();

        for (int i = 0; i < Alphabet.length; i++) {
            s = s.replaceAll(Alphabet[i], "A");
            

        }
        System.out.println(s.length());

    }
}

