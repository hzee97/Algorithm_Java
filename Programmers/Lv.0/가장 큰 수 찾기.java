import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0,0};
        
        int max_num = 0;
        int max_num_idx = 0;
        
        for (int i=0; i<array.length; i++){
            if (array[i]>max_num){
                max_num = array[i];
                max_num_idx = i;
            }
        }
        
        answer[0] = max_num;
        answer[1] = max_num_idx;
        
        return answer;
    }
}