package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i =0; i<a ; i++){
            for(int j = a; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
