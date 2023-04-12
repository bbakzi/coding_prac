
//완주하지 못한 선수
//1. 참가자에도 있고 완주자에도 있는 사람들을 비교해서 빼준다. 참가자 배열에 남은 사람이 완주x : equals()
//2. 큰쪽에서 작은 쪽을 비교해야 큰쪽에 남는 사람이 있다.


import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        //Arrays.sort(); 오름차순으로 배열을 정리하는
        // Arrays.sort(Arrays, Collections.reverseOrder()); 내림차순으로 배열을 정리하는
        int i; // int i를 밖으로 뺀 이유는 무엇인가...? 안에 넣었을 때는 안되고 빼면 되는 이유는? : 동명이인이 있다면 출력의 오류가 생긴다!
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }return participant[i];
    }
}
//이 문제는 다시 한번 파봐야 겠다...검색 및 숙달이 더 필요함...