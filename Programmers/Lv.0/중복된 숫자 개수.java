import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        answer=(int) Arrays.stream(array).filter(num->num==n).count();
        return answer;
    }
}

/*
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]==n){
                answer++;
            }
        }
        return answer;
    }
}
*/
