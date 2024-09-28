import java.util.*;

public class Weird {
    public static void main(String[] args) {
        String s = "tr he wo";
        StringBuilder answer = new StringBuilder(); // StringBuilder 사용
        String[] list = s.split("");
        int count = 0;
        for(int i = 0; i < list.length; i++) {
            if(count % 2 == 0 && !list[i].contains(" ")) {
                answer.append(list[i].toUpperCase());
                count=  count+ 1;
                continue;
            }
            if(count % 2 == 1 && !list[i].contains(" ")) {
                answer.append(list[i].toLowerCase());
               count=  count+ 1;
                continue;
            }
            // 공백일때는 문자열 개수 다시 셈
            if(list[i].contains(" ")){
                answer.append(" ");
                count = 0;
                 continue;
            }
        }

      

        // 마지막에 추가된 공백 제거
        System.out.println(answer);
       ;
    }
 

}