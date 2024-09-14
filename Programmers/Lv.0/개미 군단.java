class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] info = {5,3,1};
        
        for (int i=0; i<info.length; i++){
            answer+=hp/info[i];
            hp = hp%info[i];
        }
        return answer;
    }
}