//음양 더하기

class Solution {
    // 배열의 길이를 알아야한다.
    //boolean 의 기본값은 false, 초기화 true -> 이부분은 필요 없는 부분 근데 왜 true 일때 양수인데 초기화를 안해주지..?
    //absolutes 를 "for" i<absolutes.length() -> 이부분이 잘못이었다.
    //👆수정 먼저 for 문을 통해 boolean[]의 길이를 파악 후에 음수와 양수를 나눈다. >>>근데 먼저 숫자를 나누고 마지막에 -를 붙여주는 방법도 가능한가?
    //signs의 부호를 signs에 담는다.
    //후에 배열의 합을 구한다.
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0;i<signs.length;i++){
            //⬆️ 계속 오류가 나는 것 같다...y를 ()로 감싸보기도 하고.. signs.length말고 >>> absolutes 는 해봤는데 왜 안되나?
            if(signs[i]){ //이 부분은 true 인가 false인가?
                answer+=absolutes[i];
            }else {
               answer-=absolutes[i];
            }
        }
        return answer;
    }
}