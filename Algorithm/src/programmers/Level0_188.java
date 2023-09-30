// 콜라츠 수열 만들기

import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        while (n != 1) {
            n = (n % 2 == 0) ? (n / 2) : (3 * n) + 1;
            list.add(n);
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i).intValue();

        return result;
    }
}