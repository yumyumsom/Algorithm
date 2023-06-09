import java.util.*;

class PG_Kcheck {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int check = commands[i][2];
            int []arr = new int [end-start+1];
            int idx = 0;
            for(int j=start-1; j<end; j++){
                arr[idx] = array[j];
                idx++;
            }
            Arrays.sort(arr);
            answer[i] = arr[check-1];
        }
        return answer;
    }
}