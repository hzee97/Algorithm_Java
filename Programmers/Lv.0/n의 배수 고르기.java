class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int cnt = 0;
        for (int i=0; i<numlist.length; i++){
            if (numlist[i]%n==0){
                cnt++;        
            }
        }
        
        int[] answer = new int[cnt];
        
        int val = 0;
        for (int i=0; i<numlist.length; i++){
            if (numlist[i]%n==0){
                answer[val] = numlist[i];
                val++;
            }
        }
        return answer;
    }
}