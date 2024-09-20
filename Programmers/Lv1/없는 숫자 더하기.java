// 월간 코드 챌린지 시즌3

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i=0; i<10; i++){
            final int val = i;
            if (Arrays.stream(numbers).filter(num->num==val).count()==0){
                answer+=i;
            }
        }
        
        return answer;
    }
}