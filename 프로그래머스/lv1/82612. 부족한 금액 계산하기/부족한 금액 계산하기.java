


//부족한 금액 계산하기

//>>>>나의 풀이<<<<<
//1. 놀이기구를 count 번 탓을 때 내야 하는 price 합을 sum 변수에 저장한다. sum=0, answer = money-sum
//2. for 문을 통한 값을 sum 넣는다.
//3. answer 부족하지 않느면 0을 출력 한다.if (answer>=0) else

    class Solution {
        public long solution(int price, int money, int count) {
            long sum = 0;
            long answer = 0;
            for (int i = 1; i < count+1; i++) {
                sum += price * i;
            }
            if(sum>money){
                answer=sum-money;
            }else {
                answer=0;
            }
            return answer;
        }
    }

