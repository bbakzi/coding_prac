

//문자열 내 p와 y의 개수
//1. Pp의 갯수 Yy의 갯수를 찾는다. int p = 0, int y=0 :
//2. s의 길이 파악후 Pp,Yy가 얼마나 있는지 구한다.
//3. 같으면 true, 다르면 flase.



class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0,y=0;
        String [] array = s.toLowerCase().split(""); //소문자로 바꿔서 다시 넣는 과정
        for(int i=0;i<array.length;i++){
            if("p".equals(array[i])){ //소문자로 바꾸니 equals()를 한번만 사용해서 바꿀 수 있음.
                p++;
            }else if ("y".equals(array[i])){
                y++;
            }
        }
        return (p==y)? true:false;
    }
}
//내가 몰랐던 부분
//toLowerCase().split("")
//("p".equals(array[i])