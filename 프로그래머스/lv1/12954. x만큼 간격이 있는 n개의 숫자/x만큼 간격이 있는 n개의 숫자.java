
//x만큼 간격이 있는 n 개의 숫자
//1. x 만큼의 간격 : i+x
//2. n개의 숫자 : long[] arr = new long[n]
//3. answer 의 배열에 닮는다. += answer

class Solution {
    public long[] solution(int x, int n) {
        long[] arr = new long[n];
        long num = x;
        for (int i=0; i<n; i++){
            arr[i]=num; //계속 이부분이...i가 index 라는걸..기억하자...잊지말자..
            num+=x;
        }
        return arr;
    }
}
// 나의 문제점
//x로 부터 시작해 라는 말을 놓친것
//그래서 arr[i]=num 의 공식까지 도달하지 못한점..