class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0;i<phone_number.length();i++){
            if(i<phone_number.length()-4){
                answer+='*';
            }else {
                answer+=phone_number.charAt(i); //charAt() 문자열에서 ()안의 문자를 반환한다. : 스트링의 기능 활용
            }
        }
        return answer;
    }
}