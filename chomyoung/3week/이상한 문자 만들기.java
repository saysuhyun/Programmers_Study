import java.util.Arrays;
import java.util.List;

class Solution {

    // split 해서 배열로 만든다.
    // for문
    // 홀수, 짝수 구분 : i % 2 == 0
    // 하나이상의 공백문자로 구분 => 이게 point

    // 새로운 방법: 그냥 단어 분리하지않고 쭉 밀고 나아가는 방법
        // " "이 나오면 index 재활용
    public String solution(String s) {
        int index = 0;
        StringBuilder newWord = new StringBuilder();
        String[] charArr = s.split("");
        for(String c: charArr){
            if(" ".equals(c)){
                newWord.append(" ");
                index = 0;
            }else{
                newWord.append(index % 2 == 0 ? c.toUpperCase() : c.toLowerCase());
                index++;
            }
        }
        return newWord.toString();
    }
}