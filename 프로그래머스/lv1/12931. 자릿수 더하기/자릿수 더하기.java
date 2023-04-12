
//자릿수 더하기
// charAt으로 구하는 방법
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (int i=0; i<str.length();i++){
            answer+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}

//추가적으로 알게 된 것
// 단순 자릿수를 구하는 방법 : int length = (int)(Math.log10(int 값)+1);
//문자열을 숫자로 String-> int
// int intValue1 = Integer.parseInt(str1);
//int intValue1 = Integer.valueOf(str1).intValue();


// toString, Integer,parseInt(str.substring(a,z));
// n을 String 으로 변환 : String str = Integer.toString(int value) || String str = String.valueOf(int value)
//length 길이 파악 후 값을 더한다.

//public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String str1 =Integer.toString(n);
//        for (int i=0;i<str1.length();i++){
//            answer+=Integer.parseInt(str1.substring(i,i+1));
//        }
//        return answer;
//    }
//}