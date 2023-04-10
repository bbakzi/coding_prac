//수박수박수박수박수박수?
//1. 짝수일때는 박, 홀수일때는 수를 n 번 반복한다 : for문 길이는 n 만큼 반복 후 answer의 값에 넣어 준다.

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=1;i<n+1;i++) {
            if (i%2==1){  //A
            answer+="수";
            }
            if (i%2==0){  //A
                answer+="박";
            }
        }return answer;
    }
}
//나의 실수
// A 부분에 i를 넣어야 하는데 n을 넣어서 "수수수" "박박박박"이 나왔다...
//집중...