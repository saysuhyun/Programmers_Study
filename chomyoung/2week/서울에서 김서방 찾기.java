import java.util.Arrays;

class Solution {

    // String[] -> ArrayList<String> indexOf("Kim")

    public String solution(String[] seoul) {
        return "김서방은 "+Arrays.asList(seoul).indexOf("Kim")+"에 있다";
    }
}

// 개선점 (너무 느리다.) 7.xx ms 정도 걸린듯
// 1. for문 이용 + if(kim찾으면) break; 아니면 cnt++
// 2. for문 이용 +  if (names[i].equalsIgnoreCase("kim")) {
//                return "김서방은 " + i + "에 있다";
//                    }