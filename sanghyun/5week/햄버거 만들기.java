import java.util.*;

public class Hamburger {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int answer = 0;
		List<Integer> burger = new ArrayList<>();
		
		for(int i :ingredient) {

            // 우선 재료를 버거에 넣는다.
			burger.add(i);

            // 버거 재료가 4개 이상이면 계속 검증
			while(burger.size() >= 4) {
				int n = burger.size(); // 현재 모인 버거 사이즈를 확인

                // 버거의 뒤에서부터 4가지 재료의 조합이 정확하지 않으면 탈출 다시 재료를 넣는다.
				if(!(burger.get(n-1) == 1 && burger.get(n-2)==3 && burger.get(n-3) ==2 && burger.get(n-4)==1)) {
                    break;
                }

                // 버거의 조합이 일치하면 4개를 제거한다.
				for(int j=0; j<4; j++) {
					burger.remove(burger.size() -1);
				}
				answer++;
			}
		}
       
    }
} 