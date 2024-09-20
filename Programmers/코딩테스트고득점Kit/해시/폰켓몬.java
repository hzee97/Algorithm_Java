import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();   // 중복제거
        
        for (int num : nums){
            set.add(num);
        }
        
        answer = Math.min(nums.length/2,set.size());
        
        return answer;
    }
}