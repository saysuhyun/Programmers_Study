public class 신규_아이디_추천 {

    public static void main(String[] args) {

    }


    private static class Solution {

        // 알파벳 소문자, 숫자, -, _, . 가능
        // 3<= id <= 15
        // 주의사항: . 앞 뒤 불가. 연속 사용 불가.
        // 7단계 규칙
        // 방법: 정규식 적극 활용

        public String solution(String new_id) {
            new_id = new_id.toLowerCase();                          // 1단계
            new_id = new_id.replaceAll("[^a-z0-9-_.]", "");         // 2단계
            new_id = new_id.replaceAll("\\.+", ".");                // 3단계
            new_id = new_id.replaceAll("^[.]|[.]$", "");            // 4단계
            new_id = new_id.isEmpty() ? "a" : new_id;               // 5단계
            new_id = new_id.length() >= 16 ? new_id.substring(0, 15).replaceAll("[.]$", "") : new_id; // 6단계
            new_id = extendToMinLength(new_id);                     // 7단계

            return new_id;
        }

        private String extendToMinLength(String new_id) {
            StringBuilder idBuilder = new StringBuilder(new_id);
            while (idBuilder.length() < 3) {
                idBuilder.append(idBuilder.charAt(idBuilder.length() - 1));
            }
            return idBuilder.toString();
        }

    }


}