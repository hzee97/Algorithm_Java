// 월간 코드 챌린지 시즌1

class Solution {
    public int solution(int n) {
        String answer = "";
        
        while (n!=0){
            answer+=n%3;
            n=n/3;
        }
    
        return Integer.parseInt(answer,3);
    }
}