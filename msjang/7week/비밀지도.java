public class 비밀지도 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }

    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for (int i = 0; i < n; i++) {
                String b1 = createBinary(n, arr1[i]);
                String b2 = createBinary(n, arr2[i]);

                //Integer.toBinaryString(arr1[i] | arr2[i]); 으로 연산가능

                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < b1.length(); k++) {
                    if(b1.charAt(k) == '1' || b2.charAt(k) == '1') {
                        sb.append("#");
                    }else {
                        sb.append(" ");
                    }
                }
                sb.toString();
                answer[i] = sb.toString();

            }
            //Integer.toBinaryString()

            return answer;
        }

        public String createBinary(int n, int decimal) {
            return String.format("%" + n + "s", Integer.toBinaryString(decimal)).replace(" ", "0");
        }
    }
}