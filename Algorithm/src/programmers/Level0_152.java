// 특정한 문자를 대문자로 바꾸기

class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}