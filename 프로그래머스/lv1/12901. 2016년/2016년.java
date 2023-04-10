//2016년
//1. 월,일,요일 세가지의 정보 값을 가지고 와야한다.
//2. 월에 변수는 없다. 범위는 1~12
//3. 일에 변수 29(2월),30(4,6,9,11),31(1,3,5,7,8,10,12) 세가지의 변수가 있음 : if, else if, else로 나눠 보자
//4. 366일이다 윤년이기 때문에 그럼 366/7 시작은 금요일 부터 시작. 그럼 7로 나누었을때 나머지로 계산하면 되겠다. 0=금 1=토 이런 방식으로
//위에 방법대로 하면 문제가 a,b가 366일중에 몇번째 날인줄도 알아야 한다...흠..방법이 없을까?
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int [] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int allDate = 0;
        for(int i=0; i<a-1;i++){
            allDate+= date[i];
        }
        allDate+= (b-1);
        answer = days[allDate%7];
        return answer;
    }
}
//나의 문제점..
// fix 되어 있는 값이 있을 때는 그냥 배열에 맞춰서 값을 입력하고 반복문을 돌리는 방향으로 잡아보도록 하자!!