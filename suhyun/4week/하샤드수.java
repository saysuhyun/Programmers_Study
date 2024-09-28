public class 하샤드수 {
    public boolean solution(int x) {
        // x의 자릿수 합을 구하기 위한 변수
        int sumOfDigits = 0;
        int temp = x;

        // x의 각 자릿수를 더함
        while (temp > 0) {
            sumOfDigits += temp % 10; // 마지막 자릿수 추가
            temp /= 10; // 마지막 자릿수 제거
        }

        // x가 자릿수 합으로 나누어 떨어지는지 확인
        return x % sumOfDigits == 0;
    }
}
