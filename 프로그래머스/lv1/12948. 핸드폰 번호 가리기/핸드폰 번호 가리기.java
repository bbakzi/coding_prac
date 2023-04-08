//String substring(int index) 풀이
//1. phone_number.length()-4 의 길이를 구하고 answer에 넣는다.
//2. substring 으로 뒤에서 4~끝까지를 가지고 와서 answer에 넣는다.
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i=0; i<phone_number.length()-4;i++)
            answer+='*';
        answer+= phone_number.substring(phone_number.length()-4);
        //String.substring(int index값 0부터 시작)
        return answer;
    }
}