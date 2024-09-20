class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        for (int i=0; i<answer.length; i++){
            answer[i] = k*(i+1);   
        }
        return answer;
    }
}

/*
import java.util.*;

class Solution {
    public List<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i=1; i<n+1; i++){
            if (i%k==0){
                answer.add(i);
            }
        }
        
        return answer;
    }
}
*/