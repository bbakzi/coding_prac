
//문자열 다루기 기본
//숫자와 문자를 선별 할 수 있는 방법 필요 Integer.parseInt(String)
//String s를 정수로 변환 하고 예외가 없을 때는 true, 있을 땐 false.

class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }else return false;
    }
}
//        예외를 처리하는 코드
//        try catch +(finally)를 사용해 예외를 구분하기
//        *반드시 throw 해주기* 다음 누군가가 다시 예외를 찾아야 하는 시간을 줄여준다!
//
//        예외구문 이유
//        ArithmeticException	: 정수를 0으로 나눌경우 발생
//        ArrayIndexOutOfBoundsExcetion	: 배열의 범위를 벗어난 index를 접근할 시 발생
//        ClassCastExcetion	: 변환할 수 없는 타입으로 객체를 반환 시 발생
//        NullPointException : 존재하지 않는 레퍼런스를 참조할때 발생
//        IllegalArgumentException : 잘못된 인자를 전달 할 때 발생
//        IOException	: 입출력 동작 실패 또는 인터럽트 시 발생
//        OutOfMemoryException : 메모리가 부족한 경우 발생
//        NumberFormatException : 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생

