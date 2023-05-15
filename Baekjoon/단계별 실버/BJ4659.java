import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String s = br.readLine();
            if (s.equals("end")) {

                return;
            }
            //aeiou 반드시 포함
            // 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
            //같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.

            List<Character> list = new ArrayList<>();
            list.add('a');
            list.add('e');
            list.add('i');
            list.add('o');
            list.add('u');
            boolean Aeiou = false;
            boolean can = true;
            for (int i = 0; i < s.length(); i++) {
                if (list.contains(s.charAt(i))) {
                    Aeiou = true;
                }

                if (i + 2 < s.length() && list.contains(s.charAt(i)) && list.contains(s.charAt(i + 1)) && list.contains(s.charAt(i + 2))) {
                    can = false;
                }
                if (i + 2 < s.length() && !list.contains(s.charAt(i)) && !list.contains(s.charAt(i + 1)) && !list.contains(s.charAt(i + 2))) {
                    can = false;
                }

                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    String tmp = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1));
                    if (!tmp.equals("ee") && !tmp.equals("oo")) {
                        can = false;
                    }
                }
            }
            if (Aeiou && can) {
                System.out.println("<" + s + ">" + " is acceptable.");
            } else {
                System.out.println("<" + s + ">" + " is not acceptable.");

            }
        }

    }
}


