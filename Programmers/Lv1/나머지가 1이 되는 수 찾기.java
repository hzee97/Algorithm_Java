// 월간 코드 챌린지 시즌3

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<n+1; i++){
            if (n%i==1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}