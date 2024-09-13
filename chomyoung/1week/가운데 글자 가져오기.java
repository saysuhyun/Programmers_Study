import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Solution {

    // 대상: 단어
    // what: 가운데 글자 반환
    // 추가 요건: 단어의 길이가 짝수라면 가운데 두 글자
    // validation: s >= 1 && s <= 100

    // 나올 수 있는 케이스: 홀수, 짝수
    // i%2 == 1, i%2 == 0
    // 가운데를 어떻게 가져올 것인가
    // 추려내는 로직
    // 1. 단어의 length 활용
    // 2. length가 홀수, 짝수인지에 따라
    // 3-1. 홀수: substring(length / 2, length / 2 + 1)
    // 3-2. 짝수: substring(length / 2 - 1, length / 2 + 1)
    // 추려내는 방법: substring

    public String solution(String s) {
        int length = s.length();
        if(length % 2 == 1){
            return s.substring(length / 2, length / 2 + 1);
        } else {
            return s.substring(length / 2 - 1, length / 2 + 1);
        }
    }

    // 개선점: 좀 더 의미있는 변수명
}


