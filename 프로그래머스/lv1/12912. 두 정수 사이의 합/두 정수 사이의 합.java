// 두 정수 사이의 합

class Solution {
    //경우의 수 3가지 a>b,a<b,a=b for문으로 c의 값이 나올 떄 까지 반복, if 문으로 3가지 방법을 나눔
    //a>b a~b일때 반복을 c 까지 돌려서 나온수의 합
    // a<b  b~a일때 반복을 c 까지 돌려서 나온수의 합
    // a=b a값 출력
    public long solution(int a, int b) {
        long answer = 0;

        if(a>b){     //a가 b보다 클때
            for (int i = b; i<=a;i++){
                answer+=i;
            }
        }else if(a<b){     //a가 b보다 작을때
            for (int i = a; i<=b;i++){
                answer+=i;
            }
            }else{ //a,b가 같을때
            answer=a;
        }
        return answer;
    }
}  
// 나의 실수 i<b 라고 생각 컴퓨터는 0부터 시작임을 미스 했다. 
// 처음부터 끝까지 오류 없이 완성한 첫 코딩이라 뿌듯 했지만 작은 실수로 꽤나 고전했다...다신 놓치지 말아야지..
//고수의 풀이 등차수열 식으로도 풀 수 있다. 이것도 한번 풀어보는 걸로!! 추가로 공부해서 적어 놓으자!!!
