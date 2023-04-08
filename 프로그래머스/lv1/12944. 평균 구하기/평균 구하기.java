

// 평균구하기
//arr에 있는 숫자를 for 문으로 찾고 평균을 내면 된다.
//1. arr에 있는 숫자를 모두 찾아 더한다.
//2, arr length로 나눈다.
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int num : arr){ //향상된 포문 형태 : answer 넘어가기전 어떤 과정이 있다면 변수에 저장하기 전에 사용하면 좋을듯!! 
            sum+=num;
            answer=sum/arr.length;
        }
        return answer;
    }
}