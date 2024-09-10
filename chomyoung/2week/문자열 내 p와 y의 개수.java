import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    // 문자열 s가 주어지는데, 대문자와 소문자가 섞여있다.
    // 타켓은 p와 y
    // return : p length == y length
    // if(p length, y length == 0) return true

    // 방법
    // 1. 하나의 문자열에서 특정 문자의 갯수 구하기(함수화) : .filter(s -> s == ch).count();
    // 2. 대문자와 소문자를 구별하지않는 방법 s.toLowerCase()
    // 3. string -> char[] -> List<Character>

    boolean solution(String s) {
        List<Character> charList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            charList.add(ch);
        }
        long pCount = charList.stream().filter(character -> "p".equalsIgnoreCase(character.toString())).count();
        long yCount = charList.stream().filter(character -> "y".equalsIgnoreCase(character.toString())).count();

        return pCount == yCount;
    }
}