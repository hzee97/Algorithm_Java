import java.util.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int sum_num = Arrays.stream(arr).sum();
        
        answer = (double) sum_num / arr.length;
        
        return answer;
    }
}