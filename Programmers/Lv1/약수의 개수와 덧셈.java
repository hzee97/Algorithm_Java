// 월간 코드 챌린지 시즌2

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left; i<right+1; i++){
            int cnt=0;
            for (int j=1; j<i+1; j++){
                if (i%j==0){
                    cnt+=1;
                }
            }
            if (cnt%2==0){
                answer+=i;
            } else {
                answer-=i;
            }
        }
        return answer;
    }
}