// 위클리 챌린지

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long cnt = 0;
        for(int i=1; i<=count; i++){
            cnt+=i;
        }
        
        long total = price*cnt;
        
        if (money>=total){
            answer = 0;
        } else {
            answer = (long) total - money;
        }
        
        return answer;
    }
}