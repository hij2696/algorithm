class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z')
                answer += (char)(my_string.charAt(i) - 'A' + 'a');
            else
                answer += (char)(my_string.charAt(i) - 'a' + 'A');
        }
        
        return answer;
    }
}