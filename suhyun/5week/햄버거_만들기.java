import java.util.Stack;

public class 햄버거_만들기 {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i : ingredient) {
            stack.push(i);
            // 햄버거의 조합이 완성되었는지 확인
            if (stack.size() >= 4) {
                // 최근 4개의 재료가 [빵, 야채, 고기, 빵]인지 확인
                if (stack.get(stack.size() - 1) == 1 && // 빵
                        stack.get(stack.size() - 2) == 3 && // 고기
                        stack.get(stack.size() - 3) == 2 && // 야채
                        stack.get(stack.size() - 4) == 1) { // 빵
                    // 햄버거가 완성되었으므로 카운트 증가
                    count++;
                    // 완성된 햄버거의 재료를 스택에서 제거
                    stack.pop(); // 빵
                    stack.pop(); // 고기
                    stack.pop(); // 야채
                    stack.pop(); // 빵
                }
            }
        }

        return count;
    }

}
