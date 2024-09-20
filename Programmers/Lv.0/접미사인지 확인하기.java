import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        boolean result = my_string.endsWith(is_suffix);
        
        if (result) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}