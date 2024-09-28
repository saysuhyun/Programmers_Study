public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        // 전화번호의 길이
        int length = phone_number.length();

        // 뒷 4자리 제외한 부분을 '*'로 가림
        String maskedPart = "*".repeat(length - 4);
        String visiblePart = phone_number.substring(length - 4);

        // 가린 부분과 보이는 부분을 합쳐서 반환
        return maskedPart + visiblePart;
    }
}
