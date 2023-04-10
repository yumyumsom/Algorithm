import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ3003 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //입력 받을준비
        StringTokenizer st = new StringTokenizer(br.readLine());    //한줄 받아오기 ()

        //기존: 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        int origin[] = {1, 1, 2, 2, 2, 8};
        int find[] = new int[origin.length]; //찾은 체스의 개수

        for (int i = 0; i < origin.length; i++) {

            find[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < origin.length; i++) {

            System.out.print(origin[i] - find[i]+" ");
        }

    }
}
