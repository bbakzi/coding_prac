//서울에서 김서방 찾기

//1. String [] seoul 의 전체를 알아 낸다.
//2. seoul 에서 equals()를 통해 "Kim"을 찾는다.
// ~찾는다. ~비교한다. 등의 내용이면 equals.()를 생각하자...
import java.util.ArrayList;
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i< seoul.length;i++){
            if (seoul[i].equals("Kim")){
                answer="김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}

//나의 시도
// seoul 이라는 String 에서 "Kim"이라는 key 로 위치를 찾을 수 잇을 것 같다는 생각
// 키-벨류 한쌍에 중복이 허용되지 않는 HashMap 으로 찾으려 했지만 실패...
//실패이유는 String seoul을 value 값에 넣지 못함... 기술메니저님에게 여쭤보고 가능한지 안가능 한지 추가적으로 기록
// 나의 부족한점
// equals의 활용이 익숙 하지 않다... 한국말을 java 언어로 번역하는 능력을 익혀야겠다.

// 다른 사람의 풀이
// Arrays.asList() -> Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
// asList()를 사용해서 List 객체를 만들 때 새로운 배열 객체를 만드는 것이 아니라, 원본 배열의 주소값을 가져오게 된다.
//원본 List에서 주소를 가지고 온 것이다 보니 새로운 원소를 추가하거나 삭제 할 수 없다!

//import java.util.Arrays;
//class Solution {
//    public String solution(String[] seoul) {
//        return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim")+ "에 있다";
//    }
//}
//Arrays.asList()
// java.util.Arrays.ArrayList 클래스는 set(), get(), contains() 메서드를 가지고 있지만
// 원소를 추가하는 메서드는 가지고 있지 않기 때문에 사이즈를 바꿀 수 없다.