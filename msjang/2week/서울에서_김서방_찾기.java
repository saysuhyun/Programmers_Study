public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new String[]{"Jane", null, "Kim"});
        System.out.println(result);
    }

    static class Solution {
        public String solution(String[] seoul) {

            for (int i = 0; i < seoul.length; i++) {
                if ("Kim".equals(seoul[i]))
                    return String.format("김서방은 %s에 있다", i);
            }

            return "";
        }
    }

}