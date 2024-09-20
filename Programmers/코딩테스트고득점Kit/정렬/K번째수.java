import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++){
            ArrayList<Integer> part = new ArrayList<>();
            for (int j=commands[i][0]-1; j<commands[i][1]; j++){
                part.add(array[j]);
            }
            Collections.sort(part);
            answer[i]=part.get(commands[i][2]-1);
        }
        
        return answer;
    }
}

/*
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++){
            int[] part = new int[commands[i][1]-commands[i][0]+1];
            int val = commands[i][0]-1;
            for (int j=0; j<part.length; j++){
                part[j] = array[val];
                val +=1;
            }
            Arrays.sort(part);
            answer[i]=part[commands[i][2]-1];
        }
        
        return answer;
    }
}
*/